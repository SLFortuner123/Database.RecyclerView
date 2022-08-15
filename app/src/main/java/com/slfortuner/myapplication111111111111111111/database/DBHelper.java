package com.slfortuner.myapplication111111111111111111.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(Context context) {
        super( context, "Userdata.db", null, 1 );
    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        // in the sense of primary key, name cannot be duplicated here!
        DB.execSQL( "create Table Userdetails(name TEXT primary key, email TEXT, age TEXT)" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {

        DB.execSQL( "drop Table if exists Userdetails" );

    }

    public boolean insertuserdata(String name, String email, String age) {

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put( "name", name );
        contentValues.put( "email", email );
        contentValues.put( "age", age );

        long result = DB.insert( "Userdetails", null, contentValues );
        if (result ==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public Cursor getData()
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        // in this entire table will pass into the cursor cuz you are not wrinting conditions//
        Cursor cursor = DB.rawQuery( "Select * from Userdetails", null );
        return cursor;

    }
}
