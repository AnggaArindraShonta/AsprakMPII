package com.example.asprakmpll.RoomDatabase.Data.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.asprakmpll.RoomDatabase.Data.Model.Mahasiswa;

import java.util.List;

@Dao
public interface MahasiswaDAO {

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getAll();

    @Insert
    void insertAll(Mahasiswa... mahasiswa);

    //Custum Query
    @Query("SELECT * FROM mahasiswa WHERE nama LIKE :nama ")
    Mahasiswa findByName(String nama);
}