package com.apps.sinsenlat1.api

import io.reactivex.Single
import retrofit2.http.*

interface ApiService {

    @POST("api/oauth/token")
    fun oauthToken(): Single<String>

    @Multipart
    @POST("api/auth/login")
    fun login(
        @Part("email") email: String?,
        @Part("password") password: String?,
    ): Single<String>

}