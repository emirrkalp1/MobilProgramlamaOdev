package com.example.emirkapp.data.api

import com.example.emirkapp.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}