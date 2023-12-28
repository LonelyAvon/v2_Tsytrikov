package com.example.tsytrikov_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class personal_area extends AppCompatActivity {
    TextView tv = findViewById(R.id.HelloUser);
    Bundle arguments = getIntent().getExtras();
    String name = arguments.get("name").toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
    }
    public void goToMain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}