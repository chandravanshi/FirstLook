package com.firstlook.firstlook.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by navcha on 10-02-2018.
 */

@Entity
public class User {
    @PrimaryKey(autoGenerate = true )
    private int uid;
    @ColumnInfo(name = "first_name")
    private String firstaName;
    @ColumnInfo(name = "last_name")
    private String lastName;

    public int getUid() {
        return uid;
    }

    public String getFirstaName() {
        return firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setFirstaName(String firstaName) {
        this.firstaName = firstaName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
