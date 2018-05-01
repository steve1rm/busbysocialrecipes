package me.androidbox.domain.entities

data class CoursesEntity(val id: String,
                         val name: String,
                         val type: String,
                         val description: String,
                         val searchValue: String,
                         val localesAvailableIn: LocalesAvailableIn)
