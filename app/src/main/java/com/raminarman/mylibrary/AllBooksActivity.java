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

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book about tigers", "Ramin", 120, "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?cs=srgb&dl=bengal-tiger-half-soak-body-on-water-during-daytime-145939.jpg&fm=jpg", "Ramin's book."));
        books.add(new Book("Book about lions", "Amin", 944, "https://cosmos-images2.imgix.net/file/spina/photo/14772/GettyImages-691120979.jpg?ixlib=rails-2.1.4&auto=format&ch=Width%2CDPR&fit=max&w=1600", "Amin's book."));
        books.add(new Book("Book about pets", "Roya", 250, "https://www.snopes.com/tachyon/2019/08/GettyImages-1005462320-e1566596015475.jpg?resize=865,452&quality=65", "Roya's book."));
        books.add(new Book("Book about foxes", "Armin", 320, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfmn5twrZ8Bckj-yD6w-A6uRaDHwJ4_ngwdnKWPnsngN_k0O9l&s", "Armin's book."));
        books.add(new Book("Book about monkeys", "Fawad", 410, "https://images.theconversation.com/files/290710/original/file-20190903-175663-lqb3z6.jpg?ixlib=rb-1.1.0&rect=48%2C0%2C5422%2C3603&q=45&auto=format&w=496&fit=clip", "Fawad's book."));
        books.add(new Book("Book about dogs", "Ramin", 535, "https://image.freepik.com/free-photo/portrait-golden-retriever-laying-down-grass_53419-4404.jpg", "Ramin's second book."));

        adapter.setBooks(books);
    }
}
