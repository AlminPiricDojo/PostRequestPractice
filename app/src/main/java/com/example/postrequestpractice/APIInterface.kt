package com.example.postrequestpractice

import retrofit2.Call
import retrofit2.http.*

interface APIInterface {
    @GET("test/")
    fun getAll(): Call<Users>

    @POST("test/")
    fun addUser(@Body userData: UsersItem): Call<UsersItem>

    // PUT replaces the full object (use PATCH to change individual fields)
    @PUT("/test/{id}")  // here we pass in the ID of the post we want to modify
    fun updateUser(@Path("id") id: Int, @Body userData: UsersItem): Call<UsersItem>

    @DELETE("/test/{id}")
    fun deleteUser(@Path("id") id: Int): Call<Void>  // we use Void to overwrite an existing post
}