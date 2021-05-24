package com.example.yddc.network.api_generator

import com.example.yddc.config.Config
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Author: RayleighZ
 * Time: 2021-05-23 17:53
 * 统一的网络请求库
 */
object ApiGenerator {

    //以后可能会用到，就先写在这里了
    private val token = ""

    private var retrofit: Retrofit = Retrofit.Builder().apply {
        baseUrl(Config.BASE_URL)
        OkHttpClient.Builder().interceptors().add(Interceptor {
            it.proceed(
                it.request().newBuilder().header("Authorization", "Bearer $token")
                    .build()
            )
        })
    }
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    fun <T> getApiService(clazz: Class<T>) = run { retrofit.create(clazz) }

}