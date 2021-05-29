package com.example.databaselokal.entity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface DataKampusDAO {
    @Insert
    Long insertData(DataKampus dataKampus);

    @Query("Select * from kampus_db")
    List<DataKampus> getData();

    @Update
    int updateData(DataKampus item);

    @Delete
    void deleteData(DataKampus item);
}
