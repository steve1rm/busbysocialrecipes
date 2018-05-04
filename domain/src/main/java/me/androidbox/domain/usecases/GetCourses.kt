package me.androidbox.domain.usecases

import io.reactivex.Observable
import me.androidbox.domain.core.Transformer
import me.androidbox.domain.core.UseCase
import me.androidbox.domain.entities.CoursesEntity
import me.androidbox.domain.yummyapi.YummyService

class GetCourses(transformer: Transformer<List<CoursesEntity>>,
                 private val yummyService: YummyService): UseCase<List<CoursesEntity>>(transformer) {

    override fun createObservable(data: Map<String, Any>?): Observable<List<CoursesEntity>> {
        return yummyService.getCoursesFromApi()
    }
}
