package com.tes.eat.anywhere.roommanager.data

import com.tes.eat.anywhere.roommanager.data.NewsApiDetails
import com.tes.eat.anywhere.roommanager.data.PeopleApiDetails
import com.tes.eat.anywhere.roommanager.data.model.news.News
import com.tes.eat.anywhere.roommanager.data.model.people.People
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {

    @GET(NewsApiDetails.Country) //to define type of request GET, POST, PUT
    suspend fun getNews(): Response<News>
}