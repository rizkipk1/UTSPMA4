package com.rizkiputrakencana.utspm6a4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SavedDatasetsInfoCallback;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button buttonLogin, buttonreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        buttonLogin = (Button) findViewById(R.id.login1);
        buttonreg= (Button) findViewById(R.id.register1);

        buttonreg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"selamat datang di form register", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,signup.class);
                MainActivity.this.startActivity(intent);
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey= username.getText().toString();
                String passwordKey= password.getText().toString();

                if (usernameKey.equals("kiki")&& passwordKey.equals("kiki") ){
                    //jika login berhasil
                    SavedDatasetsInfoCallback email,password,username;
                    Toast.makeText(getApplicationContext(),"login sukses", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MainActivity.this,profile.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau passwod anda salah")
                            .setNegativeButton("Retry",null).create().show();
                }

            }
        });
    }
}