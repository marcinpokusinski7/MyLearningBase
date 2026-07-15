package com.ti.mylearningbase.learning.adapter.inbound.graphql

import com.ti.mylearningbase.learning.adapter.inbound.graphql.input.CreateLearningNoteInput
import com.ti.mylearningbase.learning.adapter.inbound.graphql.mapper.LearningNoteGraphqlMapper
import com.ti.mylearningbase.learning.adapter.inbound.graphql.response.LearningNoteResponse
import com.ti.mylearningbase.learning.application.command.CreateLearningNoteCommand
import com.ti.mylearningbase.learning.application.port.input.CreateLearningNoteUseCase
import com.ti.mylearningbase.learning.application.port.input.GetLearningNoteUseCase
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class LearningNoteController(
    private val createLearningNoteUseCase: CreateLearningNoteUseCase,
    private val getLearningNoteUseCase: GetLearningNoteUseCase,
    private val mapper: LearningNoteGraphqlMapper
) {

    @QueryMapping
    fun learningNote(@Argument id: Long): LearningNoteResponse? =
        getLearningNoteUseCase.findById(id)
            ?.let(mapper::toLearningNoteResponse)

    @MutationMapping
    fun createLearningNote(
        @Argument input: CreateLearningNoteInput
    ): LearningNoteResponse {
        val command = CreateLearningNoteCommand(
            technologyId = input.technologyId,
            title = input.title,
            summary = input.summary,
            content = input.content,
            difficulty = input.difficulty
        )

        return createLearningNoteUseCase.create(command)
            .let(mapper::toLearningNoteResponse)
    }
}