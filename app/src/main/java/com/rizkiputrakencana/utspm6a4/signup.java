package com.rizkiputrakencana.utspm6a4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SavedDatasetsInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText username,password,email;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        email =(EditText) findViewById(R.id.email1);
        signup= (Button) findViewById(R.id.register2);
        signup.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String username1=username.getText().toString();
                String password1=password.getText().toString();
                String email1=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(signup.this, "your username is "+username1,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(signup.this,MainActivity.class);
                signup.this.startActivity(intent);
            }
        });

    }
}