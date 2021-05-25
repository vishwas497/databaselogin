package com.producation.vishwas.roomdatabase.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.producation.vishwas.roomdatabase.Models.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)

public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();

}
