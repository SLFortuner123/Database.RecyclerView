package com.slfortuner.myapplication111111111111111111.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.slfortuner.myapplication111111111111111111.R;
import com.slfortuner.myapplication111111111111111111.adapters.DBAdapter;
import com.slfortuner.myapplication111111111111111111.models.DBModel;

import java.util.ArrayList;
import java.util.List;

public class UserList extends AppCompatActivity {

    RecyclerView recyclerView;
    DBHelper DB;
    List<DBModel> DBlist;
    DBAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user_list );

        DB = new DBHelper( this );
        DBlist = new ArrayList<>();

        recyclerView = findViewById( R.id.recyclerViewDB );
        adapter = new DBAdapter( this, DBlist );
        recyclerView.setAdapter( adapter );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        adapter.notifyDataSetChanged();

        initData();


    }

    private void initData() {
        Cursor cursor = DB.getData();
        if (cursor.getCount() == 0) {
            Toast.makeText( UserList.this, "No entry exists", Toast.LENGTH_LONG ).show();
            return;

        }


        {
            while (cursor.moveToNext()) {
                DBModel dbModel = new DBModel( cursor.getString( 0 ), cursor.getString( 1 ), cursor.getString( 2 ) );
                DBlist.add( dbModel );

//                DBlist.add( cursor.getPosition() );


            }
        }
    }
}