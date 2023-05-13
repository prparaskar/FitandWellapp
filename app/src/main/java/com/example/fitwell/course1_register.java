package com.example.fitwell;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class course1_register extends AppCompatActivity {
    private EditText name, dob, address, coursenn;
    private Button register1;
    private ImageView imgbanner;
    DatabaseReference applicantdbref;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1_register);

        name=findViewById(R.id.applicantname);
        dob=findViewById(R.id.dateofbirth);
        address=findViewById(R.id.address);
        coursenn=findViewById(R.id.coursenamee);
        imgbanner=findViewById(R.id.course1banner);
        register1=findViewById(R.id.registerfinal1);

        imgbanner.setImageResource(R.drawable.bannercourse1);

        applicantdbref= FirebaseDatabase.getInstance().getReference().child("Applicants");


        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               insertapplicantdata();
            }
        });


    }

    private void insertapplicantdata() {
        String namee=name.getText().toString();
        String dobb=dob.getText().toString();
        String addresss=address.getText().toString();
        String coursename=coursenn.getText().toString();

        Appliicantdata applicant= new Appliicantdata(namee,dobb,addresss,coursename);

        applicantdbref.push().setValue(applicant);
        Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show();
    }
}