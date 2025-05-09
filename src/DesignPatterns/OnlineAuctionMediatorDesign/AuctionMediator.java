package DesignPatterns.OnlineAuctionMediatorDesign;

public interface AuctionMediator {

    void addBidder(Colleague colleague);
    void placeBid(Colleague colleague, int bidAmount);
}
