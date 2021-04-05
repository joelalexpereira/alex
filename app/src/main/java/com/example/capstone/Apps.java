package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Apps extends AppCompatActivity {
    FirebaseAuth fAuth;
    Button remote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        fAuth = FirebaseAuth.getInstance();
        remote = (Button)findViewById(R.id.remote);

        remote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), remotecamera.class));
            }
        });
    }

    public void logout(View view){
        fAuth.signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void back(View view){
        startActivity(new Intent(getApplicationContext(), homepage.class));
    }
}
