package com.example.fitwell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Courselisting extends AppCompatActivity {
    private Button course1, course2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselisting);

        course1=findViewById(R.id.registercourse1);
        course2=findViewById(R.id.registercourse2);

        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), course1_register.class);
                Toast.makeText(Courselisting.this, "Proceeding to register", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), course1_register.class);
                Toast.makeText(Courselisting.this, "Proceeding to register", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });



    }
}