package LLD.ApplyingCouponsOnShoppingCart;

import java.util.*;

public class ProductTypeCouponDecortor extends CouponDecorator{

    Product product;
    int percentageDiscount;
    ProductType productType;
    List<ProductType> eligibleList = Arrays.asList(ProductType.ELECTRONICS);

    ProductTypeCouponDecortor(Product product, int percentageDiscount, ProductType productType){
        this.product = product;
        this.percentageDiscount = percentageDiscount;
        this.productType = productType;
    }
    

    @Override
    public double getPrice(){
        if(eligibleList.contains(productType)){
            double productPrice = product.getPrice();
            return productPrice - (productPrice * percentageDiscount)/100;
        }
        return product.getPrice();
    }
}
