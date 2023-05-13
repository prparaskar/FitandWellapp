package com.example.fitwell;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registersignup extends AppCompatActivity {
    EditText nuname,nemail,inputpassword,confirminputpassword;
    Button btnsignup,haveanaccount;
    ProgressDialog progressDialog;

    FirebaseAuth mAuth;
    FirebaseUser muser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registersignup);


        nuname=findViewById(R.id.editTextTextPersonName2);
        nemail=findViewById(R.id.regemailid);
        inputpassword=findViewById(R.id.createpasswordd);
        confirminputpassword=findViewById(R.id.confirmpasswordd);
        btnsignup=findViewById(R.id.materialButton3);
        haveanaccount=findViewById(R.id.haveaccountt);
        progressDialog=new ProgressDialog(this);

        mAuth=FirebaseAuth.getInstance();
        muser=mAuth.getCurrentUser();

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformAuth();
            }
        });






        haveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });



    }

    private void PerformAuth() {
        String email=nemail.getText().toString();
        String Name=nuname.getText().toString();
        String Password=inputpassword.getText().toString();
        String Confirmpassword= confirminputpassword.getText().toString();

        if(Password.isEmpty()|| Password.length()<6){
            inputpassword.setError("Enter min. 6 digit password");
        }

//        if(Password.equals(Confirmpassword)){
//            confirminputpassword.setError("Password not matched");
//        }
        else{
            progressDialog.setMessage("Signing up...");
            progressDialog.setTitle("Please wait!");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        progressDialog.dismiss();;
                        Toast.makeText(Registersignup.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                        sendtoanotheractivity();
                    }
                }
            });
        }
    }

    private void sendtoanotheractivity() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}