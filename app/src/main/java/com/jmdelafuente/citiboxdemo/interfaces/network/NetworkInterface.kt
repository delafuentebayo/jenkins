package com.jmdelafuente.citiboxdemo.interfaces.network

import com.jmdelafuente.citiboxdemo.models.NetworkClasses
import retrofit2.Call
import retrofit2.http.*


interface NetworkInterface {
    @GET("episode")
    fun getEpisodes(): Call<NetworkClasses.Episodes>

    @GET("episode")
    fun getNextEpisodes(@Query("page") page: String): Call<NetworkClasses.Episodes>

    @GET("character/{characterids}")
    fun getCharacters(@Path("characterids") charactersId: List<Int>): Call<ArrayList<NetworkClasses.Character>>
}