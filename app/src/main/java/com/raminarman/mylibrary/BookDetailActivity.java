package com.raminarman.mylibrary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookDetailActivity extends AppCompatActivity {

    private TextView bookName, bookAuthor, numberOfPages, description;
    private ImageView bookImage;
    private Button btnAddCurrently, btnAddWantRead, btnAddAlreadyRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        initWidgets();

        Intent intent = getIntent();
        int id = intent.getIntExtra("bookId", 0);
        ArrayList<Book> books = Util.getAllBooks();
        for (Book b: books) {
            if (b.getId() == id) {
                bookName.setText(b.getName());
                bookAuthor.setText(b.getAuthor());
                description.setText(b.getDescription());
                numberOfPages.setText("90");
                Glide.with(this)
                        .asBitmap()
                        .load(b.getImageUrl())
                        .into(bookImage);

            }
        }

        btnAddCurrently.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(BookDetailActivity.this);
                builder.setMessage("The book is already added to the currently reading list.");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setCancelable(false);
                builder.show();

            }
        });
    }

    private void initWidgets() {
        bookName = findViewById(R.id.bookName);
        bookAuthor = findViewById(R.id.bookAuthor);
        description = findViewById(R.id.description);
        numberOfPages = findViewById(R.id.numberOfPages);
        bookImage = findViewById(R.id.bookImage);

        btnAddCurrently = findViewById(R.id.btnAddCurrently);
        btnAddWantRead = findViewById(R.id.btnAddWantRead);
        btnAddAlreadyRead = findViewById(R.id.btnAddAlreadyRead);
    }
}
