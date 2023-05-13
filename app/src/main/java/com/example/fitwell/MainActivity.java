package com.example.fitwell;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    EditText passworddin,emailid;
    Button btnlogin, signupreg;

    FirebaseAuth mAuth;
    FirebaseUser muser;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       passworddin=findViewById(R.id.passwordin);
       emailid=findViewById(R.id.useridin);
       btnlogin=findViewById(R.id.materialButton);
       signupreg=findViewById((R.id.materialButton2));
       progressDialog=new ProgressDialog(this);

        mAuth=FirebaseAuth.getInstance();
        muser=mAuth.getCurrentUser();

        signupreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtoregister();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });


    }

    private void sendtoregister() {
        Intent intent=new Intent(this, Registersignup.class);
        startActivity(intent);
    }

    private void performLogin() {

        String email=emailid.getText().toString();
        String password=passworddin.getText().toString();

        if(password.isEmpty()|| password.length()<6){
            passworddin.setError("Enter proper password");
        }

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.setMessage("Login successful...");
                    progressDialog.setTitle("Signed in!");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();

                    sendtosignedinactivity();
                }
            }
        });
    }

    private void sendtosignedinactivity() {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Showoptions.class);
        startActivity(intent);

    }
}