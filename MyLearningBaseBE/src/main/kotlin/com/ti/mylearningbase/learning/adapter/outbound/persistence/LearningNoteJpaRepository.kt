package com.ti.mylearningbase.learning.adapter.outbound.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface LearningNoteJpaRepository : JpaRepository<LearningNoteEntity, Long>