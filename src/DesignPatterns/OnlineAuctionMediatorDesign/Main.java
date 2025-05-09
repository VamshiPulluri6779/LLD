package DesignPatterns.OnlineAuctionMediatorDesign;

public class Main {
    public static void main(String[] args) {
        
        AuctionMediator auction = new Auction();

        Bidder bidder1 = new Bidder("MI", auction);
        Bidder bidder2 = new Bidder("CSK", auction);

        bidder1.placeBid(2000);
        bidder2.placeBid(4000);

    }
    
}
