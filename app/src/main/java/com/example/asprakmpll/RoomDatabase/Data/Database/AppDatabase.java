package com.example.asprakmpll.RoomDatabase.Data.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.asprakmpll.RoomDatabase.Data.Model.Mahasiswa;
import com.example.asprakmpll.RoomDatabase.Data.DAO.MahasiswaDAO;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MahasiswaDAO userDao();
}
