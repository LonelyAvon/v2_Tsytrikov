package com.example.tsytrikov_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name = findViewById(R.id.editTextTextPersonName2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToPersonalArea(View view)
    {
        Intent intent = new Intent(this, personal_area.class);
        intent.putExtra("UserName", name.getText());
        startActivity(intent);
    }

}