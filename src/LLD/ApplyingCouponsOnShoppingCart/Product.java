package LLD.ApplyingCouponsOnShoppingCart;

public abstract class Product {

    double originalPrice;
    String name;
    ProductType productType;

    Product(){}

    Product(double originalPrice, String name, ProductType productType){
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }
    

    public abstract double getPrice();

    public ProductType getType(){
        return this.productType;
    }
}
