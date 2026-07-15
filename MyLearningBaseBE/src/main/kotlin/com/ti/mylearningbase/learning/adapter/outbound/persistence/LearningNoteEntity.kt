package com.ti.mylearningbase.learning.adapter.outbound.persistence

import com.ti.mylearningbase.learning.domain.Difficulty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "learning_notes")
class LearningNoteEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "technology_id", nullable = false)
    var technologyId: Long,

    @Column(nullable = false)
    var title: String,

    var summary: String?,

    @Column(nullable = false, columnDefinition = "TEXT")
    var content: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var difficulty: Difficulty
)
