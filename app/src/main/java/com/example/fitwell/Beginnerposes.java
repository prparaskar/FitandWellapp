package com.example.fitwell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Beginnerposes extends AppCompatActivity {

    private Button treepose,childpose, downwardfacingpose,catstretchpose, butterflyposee, bhujangasan, headtokne, pushthewal,sukhasann;
    private static ImageView imgviewposes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginnerposes);


        treepose=findViewById(R.id.showtreeposture);
        childpose=findViewById(R.id.showchildpose);
        downwardfacingpose=findViewById(R.id.showdownfacingpose);
        butterflyposee=findViewById(R.id.butterflypose);
        bhujangasan=findViewById(R.id.bhujangasan);
        headtokne=findViewById(R.id.headtoknee);
        pushthewal=findViewById(R.id.pushthewallpose);
        sukhasann=findViewById(R.id.sukhassanpose);
        imgviewposes=findViewById(R.id.imageviewbeginerposes);
        catstretchpose=findViewById(R.id.catstretch);
        imgviewposes.setImageResource(R.drawable.defaultbeginerposes);


        treepose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   imgviewposes.setImageResource(R.drawable.treeposture);
            }
        });


        childpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.childpose);
            }
        });

        downwardfacingpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.downwardfacingpose);
            }
        });

        catstretchpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.catstretch);
            }
        });

        butterflyposee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.butterflyposee);
            }
        });

        bhujangasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.bhujangasann);
            }
        });

        headtokne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.headtokneefinalpic);
            }
        });

        pushthewal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.pushthewallfinalpic);
            }
        });

        sukhasann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgviewposes.setImageResource(R.drawable.sukhassanfinalpic);
            }
        });
    }
}