package com.example.tsytrikov_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class personal_area extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = findViewById(R.id.HelloUser);
        setContentView(R.layout.activity_personal_area);
    }
    public void goToMain(View view)
    {
        Intent intent = new Intent(this, Authorization.class);
        startActivity(intent);
    }
    public void goToOther(View view)
    {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
    public void toLearn(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kinopoisk.ru/"));
        startActivity(intent);
    }


}