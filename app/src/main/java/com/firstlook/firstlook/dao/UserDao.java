package com.firstlook.firstlook.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.firstlook.firstlook.entity.User;

import java.util.List;

/**
 * Created by navcha on 10-02-2018.
 */
@Dao
public interface UserDao {
    @Query("SELECT * frOM user")
    List<User> getAll();
    @Query("Select * from user where uid in (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("Select * from user where first_name LIKE :first and last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Insert
    void insertAll(User ... users);

    @Delete
    void delte(User user);

}
