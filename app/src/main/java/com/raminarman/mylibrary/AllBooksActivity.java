package com.raminarman.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    // logt
    private static final String TAG = "AllBooksActivity";

    private RecyclerView booksRecView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        Log.d(TAG, "onCreate: started");

        booksRecView = findViewById(R.id.recyclerView);

        BooksRecViewAdapter adapter = new BooksRecViewAdapter(this);


        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager( this, 2));

        Util util = new Util();
        ArrayList<Book> books = Util.getAllBooks();

        adapter.setBooks(books);
    }
}
