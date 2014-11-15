/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.auction.controller;

import java.io.Serializable;
import javax.inject.Named;
import mum.auction.model.impl.Book;

/**
 *
 * @author Komal
 */

@Named("book")
public class BookBean implements Serializable{
    
    private Book book;
    
    public Book getBook()
    {
        return book;
    }
    
    public void setBook(Book book)
    {
        this.book = book;
    }
    
    
}
