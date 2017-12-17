package gvnavin.java8.streams.flatmap_demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gnavin on 7/4/16.
 */
public class Student {

    private String name;
    private Set<String> book;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(final Set<String> book) {
        this.book = book;
    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

}
