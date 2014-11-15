/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.auction.model.impl;

/**
 *
 * @author Fetiya
 */
public class Bid {
    
    private int Id;
    private Auction auction;
    private User user;
    private int offeredPrice;

    public Bid() {
    }

    public Bid(Auction auction, User user, int offeredPrice) {
        this.auction = auction;
        this.user = user;
        this.offeredPrice = offeredPrice;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(int offeredPrice) {
        this.offeredPrice = offeredPrice;
    }
    
    
    
    
    
    
    
}
