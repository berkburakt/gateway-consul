package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable

@Fallback
class ErrorService2Client implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        Flowable.just([])
    }
}
