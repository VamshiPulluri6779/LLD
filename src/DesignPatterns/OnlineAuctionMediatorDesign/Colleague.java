package DesignPatterns.OnlineAuctionMediatorDesign;

public interface Colleague {
    
    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getBidderName();

}
