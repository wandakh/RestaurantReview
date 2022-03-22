package com.example.restaurantreview


import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")

    fun getRestaurant(
        @Path("id") id:String
    ): Call<RestaurantResponse>


    @FormUrlEncoded
    @Headers("Athorizon : token 12345")
    @POST("review")
    fun postreview(
        @Field("id")id: String,
        @Field("name")name:String,
        @Field("review") review:String
    ): Call<PosReviewResponse>

}