package com.raminarman.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    // logt
    private static final String TAG = "AllBooksActivity";

    private RecyclerView recyclerView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        Log.d(TAG, "onCreate: started");

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        books.add("Book 4");
        books.add("Book 5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, books);
        recyclerView.setAdapter(adapter);
    }
}
