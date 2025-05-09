package DesignPatterns.OnlineAuctionMediatorDesign;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator auction){
        this.name = name;
        this.auctionMediator = auction;
        this.auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount){
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(int bidAmount){
        System.out.println("Bidder "+name+" has received notification for bid amount "+bidAmount);
    }
    
    @Override
    public String getBidderName(){
        return name;
    }
}
