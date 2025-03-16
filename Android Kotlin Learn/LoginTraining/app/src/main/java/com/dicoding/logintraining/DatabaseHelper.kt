package com.dicoding.logintraining

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(val context: Context):
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object    {
        const val DATABASE_NAME = "login.db"
        const val DATABASE_VERSION = 1
        const val TABLE_NAME = "login"
        const val COL_ID = "id"
        const val COL_USERNAME = "username"
        const val COL_PASSWORD = "password"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE $TABLE_NAME (" +
                "$COL_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COL_USERNAME TEXT, " +
                "$COL_PASSWORD TEXT)"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val dropTable = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(dropTable)
        onCreate(db)
    }

    fun insertUser(username: String, password: String): Long {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(COL_USERNAME, username)
            put(COL_PASSWORD, password)
        }
        return db.insert(TABLE_NAME, null, contentValues)
    }

    fun getUser(username: String, password: String): Boolean {
        val db = readableDatabase
        val selection = "$COL_USERNAME = ? AND $COL_PASSWORD = ?"
        val selectionArgs = arrayOf(username, password)
        val cursor = db.query(TABLE_NAME, null, selection, selectionArgs, null, null, null)

        val userExists = cursor.count > 0
        cursor.close()
        return userExists
    }
}