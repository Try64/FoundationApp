package com.msiazn.foundationapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.msiazn.foundationapp.data.database.daos.CustomerDao
import com.msiazn.foundationapp.data.database.entities.CustomerEntity

@Database(entities = [CustomerEntity::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun customerDao(): CustomerDao
}