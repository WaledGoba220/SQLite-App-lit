package com.example.mysqliteapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ArticleDbHelper(context: Context) :SQLiteOpenHelper(context,DBName, null, DBVERSION){
    override fun onCreate(database: SQLiteDatabase?) {
        val sql = "CREATE TABLE ${DB.TABLE_NAME} ( " +
                "${DB.ID} INTEGER PRIMARY KEY," +
                "${DB.TITLE} TEXT, "+
                "${DB.BODY} Text" +
                ")"

        database?.execSQL(sql)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }



    companion object{
        private  const val DBName = "ArticleDatabase"
        private  const val DBVERSION = 1

    }

}