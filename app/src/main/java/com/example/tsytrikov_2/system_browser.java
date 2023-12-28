package com.example.tsytrikov_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class system_browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_browser);
    }
    public void web(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kinopoisk.ru/"));
        startActivity(i);
    }
}