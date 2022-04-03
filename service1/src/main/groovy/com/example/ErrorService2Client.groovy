package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable

@Fallback
class ErrorService2Client implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        Book book1 = new Book(title: "Title1", author: "author1", isbn: "xxxxxxx")
        return Flowable.just([book1])
    }
}
