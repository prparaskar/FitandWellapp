package com.example.fitwell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Showoptions extends AppCompatActivity {
private Button knowmore;
private Button getstarted, listcourses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showoptions);

        knowmore=findViewById(R.id.beginerposesbutton);
        getstarted=findViewById(R.id.opt2button);
        listcourses=findViewById(R.id.courselisting);



        knowmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Beginnerposes.class);
                Toast.makeText(Showoptions.this, "Getting started", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        listcourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent=new Intent(getApplicationContext(), Courselisting.class);
                Toast.makeText(Showoptions.this, "Listing courses for you", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}