package me.androidbox.domain.yummyapi

import io.reactivex.Observable
import me.androidbox.domain.entities.CoursesEntity

interface YummyService {
    fun getCoursesFromApi(): Observable<List<CoursesEntity>>
}
