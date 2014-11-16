/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.auction.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import mum.auction.model.impl.Book;

/**
 *
 * @author Komal
 */

@Named("book")
@SessionScoped
public class BookBean implements Serializable{
    
    private Book book;
    private List<Book> books = new ArrayList<Book>();
    
    public Book getBook()
    {
        return book;
    }
    
    public void setBook(Book book)
    {
        this.book = book;
    }

    /**
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    
    
    
}
