package com.feelingm.mvvmtest.network

import com.feelingm.mvvmtest.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}