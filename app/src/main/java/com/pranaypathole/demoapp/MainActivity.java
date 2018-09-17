package com.pranaypathole.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Login(View view){
        EditText email = findViewById(R.id.emailLogin);
        EditText password = findViewById(R.id.pwdentry);

        Log.i("Info", "Login");

        Toast.makeText(this, "Logged in" + email.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void signup(View view){
        Log.i("info", "Signup!");

        Toast.makeText(this, "Sign up", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
