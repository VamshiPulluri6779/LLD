package LLD.ApplyingCouponsOnShoppingCart;

public class Product1 extends Product{

    Product1(String name, double originalPrice, ProductType productType){
        super(originalPrice, name, productType);
    }
    
    @Override
    public double getPrice(){
        return this.originalPrice;
    }
}
