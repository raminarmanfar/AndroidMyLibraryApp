package com.raminarman.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> alreadyReadBooks;

    public Util() {
        if (allBooks == null) {
            allBooks = new ArrayList<>();
            initAllBooks();
        }

        if (currentlyReadingBooks == null) {
            currentlyReadingBooks = new ArrayList<>();
        }

        if (wantToReadBooks == null) {
            wantToReadBooks = new ArrayList<>();
        }

        if (alreadyReadBooks == null) {
            alreadyReadBooks = new ArrayList<>();
        }
    }

    private static void initAllBooks() {
        allBooks.add(new Book(1, "Book about tigers", "Ramin", 120, "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?cs=srgb&dl=bengal-tiger-half-soak-body-on-water-during-daytime-145939.jpg&fm=jpg", "Ramin's book."));
        allBooks.add(new Book(2, "Book about lions", "Amin", 944, "https://cosmos-images2.imgix.net/file/spina/photo/14772/GettyImages-691120979.jpg?ixlib=rails-2.1.4&auto=format&ch=Width%2CDPR&fit=max&w=1600", "Amin's book."));
        allBooks.add(new Book(3, "Book about pets", "Roya", 250, "https://www.snopes.com/tachyon/2019/08/GettyImages-1005462320-e1566596015475.jpg?resize=865,452&quality=65", "Roya's book."));
        allBooks.add(new Book(4, "Book about foxes", "Armin", 320, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfmn5twrZ8Bckj-yD6w-A6uRaDHwJ4_ngwdnKWPnsngN_k0O9l&s", "Armin's book."));
        allBooks.add(new Book(5, "Book about monkeys", "Fawad", 410, "https://images.theconversation.com/files/290710/original/file-20190903-175663-lqb3z6.jpg?ixlib=rb-1.1.0&rect=48%2C0%2C5422%2C3603&q=45&auto=format&w=496&fit=clip", "Fawad's book."));
        allBooks.add(new Book(6, "Book about dogs", "Ramin", 535, "https://image.freepik.com/free-photo/portrait-golden-retriever-laying-down-grass_53419-4404.jpg", "Ramin's second book."));

        allBooks.add(new Book(7, "Book about rabbits", "Milad", 185, "https://opimedia.azureedge.net/-/media/images/grt/editorial/articles/magazine-articles/2019/11-01/a-diy-alternative-rabbit-tractor/diyrabbittractor-1-adobe-sq-jpg.jpg", "Ramin's book."));
        allBooks.add(new Book(8, "Book about cows", "Amin", 234, "https://img.etimg.com/thumb/msid-64336222,width-480,height-360,imgsize-63461,resizemode-4/miss-missy-1200000.jpg", "Amin's book."));
        allBooks.add(new Book(9, "Book about cats", "Milad", 640, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Felis_silvestris_silvestris.jpg/170px-Felis_silvestris_silvestris.jpg", "Roya's book."));
        allBooks.add(new Book(10, "Book about birds", "Ali", 285, "https://kidoinfo.com/wp-content/uploads/2018/10/Keel-Billed-Toucan-min-1024x681-1.jpg", "Armin's book."));
        allBooks.add(new Book(11, "Book about tigers 2", "Fawad", 364, "https://i.ytimg.com/vi/3tKHZt2lpl0/maxresdefault.jpg", "Fawad's book."));
        allBooks.add(new Book(12, "Book about goats", "Reza", 211, "https://www.datocms-assets.com/6258/1559668651-animalsoftheworld.jpg?w=1200", "Ramin's second book."));
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static boolean addAllBooks(Book book) {
        return allBooks.add(book);
    }

    public static boolean addCurrentlyReadingBooks(Book book) {
        return currentlyReadingBooks.add(book);
    }

    public static boolean addWantToReadBooks(Book book) {
        return wantToReadBooks.add(book);
    }

    public static boolean addAlreadyReadBooks(Book book) {
        return alreadyReadBooks.add(book);
    }

    public static boolean removeAllBook(Book book) {
        return allBooks.remove(book);
    }

    public static boolean removeCurrentlyReadingBook(Book book) {
        return currentlyReadingBooks.remove(book);
    }

    public static boolean removeWantToReadBook(Book book) {
        return wantToReadBooks.remove(book);
    }

    public static boolean removeAlreadyReadBook(Book book) {
        return alreadyReadBooks.remove(book);
    }
}