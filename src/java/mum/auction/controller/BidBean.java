/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.auction.controller;

import java.io.Serializable;
import javax.inject.Named;
import mum.auction.model.impl.Bid;

/**
 *
 * @author Fetiya
 */
@Named("bid")
public class BidBean implements Serializable {
    
   private Bid bid;

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }
   
   
    
}
