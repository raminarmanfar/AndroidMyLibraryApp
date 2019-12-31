package com.raminarman.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeAll, btnCurrentlyReading, btnWantToRead, btnAlreadyRead, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setOnClickListeners();
    }

    private void initWidgets() {
        btnSeeAll = findViewById(R.id.btnAllBooks);
        btnCurrentlyReading = findViewById(R.id.btnCurrentBooks);
        btnWantToRead = findViewById(R.id.btnWantToReadBooks);
        btnAlreadyRead = findViewById(R.id.btnAlreadyReadBooks);
        btnAbout = findViewById(R.id.btnAbout);
    }

    private void setOnClickListeners() {
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }
}
