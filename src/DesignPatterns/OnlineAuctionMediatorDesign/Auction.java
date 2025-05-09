package DesignPatterns.OnlineAuctionMediatorDesign;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagues;

    Auction(){
        colleagues = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague colleague){
        colleagues.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int bidAmount){

        for(Colleague c : colleagues){
            if(c != colleague ){
                c.receiveBidNotification(bidAmount);
            }
        }
    }
}
