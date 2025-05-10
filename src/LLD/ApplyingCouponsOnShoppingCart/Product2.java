package LLD.ApplyingCouponsOnShoppingCart;

public class Product2 extends Product{

    Product2(String name, double originalPrice, ProductType productType){
        super(originalPrice, name, productType);
    }
    
    @Override
    public double getPrice(){
        return this.originalPrice;
    }
}
