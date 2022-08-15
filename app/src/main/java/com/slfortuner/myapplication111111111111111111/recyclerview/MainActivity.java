package com.slfortuner.myapplication111111111111111111.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.slfortuner.myapplication111111111111111111.R;
import com.slfortuner.myapplication111111111111111111.database.MainOne;
import com.slfortuner.myapplication111111111111111111.database.UserList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyModel> userList;
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    LinearLayoutManager layoutManager;

    private Button toActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_list );


        toActivity = findViewById( R.id.buttontodb );
        toActivity.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainOne.class);
                startActivity( intent );
            }
        } );



        initData();
        initRecyclerView();




    }



    private void initData() {

        userList = new ArrayList<>();

        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));
        userList.add( new MyModel( R.drawable.ic_launcher_background, "dsdds", "dsadsadsadas"  ));
        userList.add( new MyModel(R.drawable.ic_launcher_background,"dsds", "dsdsd" ));



    }

    private void initRecyclerView() {
        recyclerView = findViewById( R.id.recycler_view1);
        layoutManager = new LinearLayoutManager( this );
        layoutManager.setOrientation( RecyclerView.VERTICAL );
        recyclerView.setLayoutManager( layoutManager );
        myAdapter = new MyAdapter( userList );
        recyclerView.setAdapter( myAdapter );
        myAdapter.notifyDataSetChanged();

    }

}
