/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.auction.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import mum.auction.dao.impl.AuctionDAOImpl;
import mum.auction.dao.intr.AuctionDAO;
import mum.auction.model.impl.Auction;

/**
 *
 * @author Fetiya
 */

@Named("auctionBn")
@SessionScoped
public class AuctionBean implements Serializable {
    
    private AuctionDAO auctionDAO= new AuctionDAOImpl();
    private Auction auction;

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }
   
    public void addAuction()
    {
       auctionDAO.addAuction(auction);
    }
    
    public void cancelAuction()
    {
        auctionDAO.removeAuction(auction);
    }
}
