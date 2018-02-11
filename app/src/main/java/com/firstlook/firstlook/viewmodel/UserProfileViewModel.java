package com.firstlook.firstlook.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.firstlook.firstlook.entity.User;

/**
 * Created by navcha on 10-02-2018.
 */

public class UserProfileViewModel extends ViewModel {
    private String userId;
    private LiveData<User> user;

    public void init(String userId) {
        this.userId = userId;
    }
    public LiveData<User> getUser() {
        return user;
    }
}
