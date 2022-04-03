package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker
import io.reactivex.Flowable

@Client(id = "service2")
@CircuitBreaker(delay = "3s", attempts = "1", multiplier = "1", reset = "20s")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}
