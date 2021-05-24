package com.example.yddc.network;

import com.example.yddc.model.bean.UserInfo;
import com.example.yddc.model.bean.Word;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Author: RayleighZ
 * Time: 2021-05-24 15:51
 * Retrofit的网络请求接口
 */
public interface Api {

    //用户的注册
    @FormUrlEncoded
    @POST("/word/users/register/")
    Observable<UserInfo> registerUser(
            @Field("username")
            String username,
            @Field("password")
            String password,
            @Field("gender")
            String gender,
            @Field("phone")
            String phone,
            @Field("email")
            String email
    );

    //获取用户信息
    @GET("/word/users/{phone}")
    Observable<UserInfo> getUserInfo(
            @Path("phone")
            String phone
    );

    //通过TAG获取单词
    @GET("/word/words/all/")
    Observable<List<Word>> getWordByTAG(
            @Query("tag")
            String tag
    );

    //通过id获取单词信息
    @GET("/word/words/all/")
    Observable<Word> getWordById(
            @Query("id")
            String id
    );
}
