package com.abogomazov.property

import com.abogomazov.application.content.cv.Language
import kotlinx.serialization.Serializable

@Serializable
data class CvContent(
    val firstname: String,
    val surname: String,
    val position: String,
    val summary: String,
    val experience: List<ExperienceProperty>,
    val education: List<EducationProperty>,
    val languages: List<LanguageProperty>,
    val projects: List<ProjectProperty>,
    val skills: List<SkillProperty>
)

@Serializable
data class LanguageProperty(
    val language: Language.LanguageEnum,
    val level: Language.CefrLevel,
    val certificate: String?
)

@Serializable
data class ProjectProperty(
    val name: String,
    val description: String
)

@Serializable
data class SkillProperty(
    val category: String,
    val items: List<String>
)

@Serializable
data class ExperienceProperty(
    val company: String,
    val title: String,
    val dateFrom: String,
    val dateTo: String,
    val description: String,
    val content: List<String>
)

@Serializable
data class EducationProperty(
    val university: String,
    val program: String,
    val dateFrom: String,
    val dateTo: String,
    val description: String,
)
