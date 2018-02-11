package com.firstlook.firstlook.webservice;

import com.firstlook.firstlook.entity.User;

import java.lang.annotation.Target;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by navcha on 11-02-2018.
 */

public interface WebService {
    @GET("/users/{user}")
        Call<User> getUser(@Path("user") int userId);
}
