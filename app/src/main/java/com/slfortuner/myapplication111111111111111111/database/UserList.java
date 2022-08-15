package com.slfortuner.myapplication111111111111111111.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.slfortuner.myapplication111111111111111111.R;
import com.slfortuner.myapplication111111111111111111.recyclerview.MyAdapter;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {

    RecyclerView recyclerView;
    DBHelper DB;
    ArrayList<String> name, email, age;
    DBAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user_list );

        DB = new DBHelper( this );
        name = new ArrayList<>();
        email = new ArrayList<>();
        age = new ArrayList<>();

        recyclerView = findViewById( R.id.recyclerViewDB );
        adapter = new DBAdapter( this, name, email, age );
        recyclerView.setAdapter( adapter );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );

        initData();




    }
    private void initData()
    {
        Cursor cursor = DB.getData();
        if (cursor.getCount()==0)
        {
            Toast.makeText( UserList.this, "No entry exists" , Toast.LENGTH_LONG ).show( );
            return;
        }
        else
        {
            while (cursor.moveToNext())
            {
                name.add( cursor.getString( 0 ) );
                email.add( cursor.getString( 1 ) );
                age.add( cursor.getString( 2 ) );

            }
        }
    }
}