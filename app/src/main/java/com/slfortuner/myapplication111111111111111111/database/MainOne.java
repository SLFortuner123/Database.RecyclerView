package com.slfortuner.myapplication111111111111111111.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.slfortuner.myapplication111111111111111111.R;

public class MainOne extends AppCompatActivity {

    EditText nameET, emailET, ageET;
    Button saveBT, viewBT;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(  R.layout.activity_main_one );

        DB = new DBHelper( this );

        nameET = findViewById( R.id.nameEdit );
        emailET = findViewById( R.id.emailEdit );
        ageET = findViewById( R.id.ageEdit );

        saveBT = findViewById( R.id.savebt );
        viewBT = findViewById( R.id.viewbt );


        viewBT.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainOne.this, UserList.class);
                startActivity( intent );
            }
        } );

        saveBT.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = nameET.getText().toString();
                String emailTXT = emailET.getText().toString();
                String ageTXT = ageET.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata( nameTXT, emailTXT, ageTXT );
                if(checkinsertdata==true)
                {
                    Toast.makeText(MainOne.this, "New entry inserted", Toast.LENGTH_LONG ).show();
                }
                else
                {
                    Toast.makeText(MainOne.this, "New entry not inserted", Toast.LENGTH_LONG ).show();
                }
            }
        } );



    }
}