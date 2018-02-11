package com.firstlook.firstlook.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.firstlook.firstlook.dao.UserDao;
import com.firstlook.firstlook.entity.User;

/**
 * Created by navcha on 10-02-2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public UserDao userDao;
}
