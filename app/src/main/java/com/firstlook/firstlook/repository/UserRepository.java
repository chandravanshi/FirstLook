package com.firstlook.firstlook.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.firstlook.firstlook.entity.User;
import com.firstlook.firstlook.webservice.WebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by navcha on 11-02-2018.
 */

public class UserRepository {
    private WebService webService;

    public LiveData<User> getUser(int userId) {
        final MutableLiveData<User> data = new MutableLiveData<>();
        webService.getUser(userId).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        return data;
    }
}
