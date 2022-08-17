package com.slfortuner.myapplication111111111111111111.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slfortuner.myapplication111111111111111111.R;
import com.slfortuner.myapplication111111111111111111.adapters.MyAdapter;
import com.slfortuner.myapplication111111111111111111.models.MyModel;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment extends Fragment {


    List<MyModel> userList;
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    LinearLayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        initData();



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_blank, container, false );
//        inflate.findViewById(  )
        recyclerView = view.findViewById( R.id.recyclerViewfrag);
        layoutManager = new LinearLayoutManager( view.getContext());
        layoutManager.setOrientation( RecyclerView.VERTICAL );
        recyclerView.setLayoutManager( layoutManager );
        myAdapter = new MyAdapter( userList );
        recyclerView.setAdapter( myAdapter );
        myAdapter.notifyDataSetChanged();

        return view;

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



}