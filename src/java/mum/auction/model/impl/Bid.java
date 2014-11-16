/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.auction.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author Fetiya
 */

@Entity
public class Bid  {
    
    @Id
    @GeneratedValue
    private int Id;
    
    @OneToOne(mappedBy = "bid",cascade = CascadeType.ALL)
    private Auction auction;
    
    @OneToOne(mappedBy = "bid",cascade = CascadeType.ALL)
    private User user;
    
    private double offeredPrice;

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

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(int offeredPrice) {
        this.offeredPrice = offeredPrice;
    }
    
    
    
    
    
    
    
}
