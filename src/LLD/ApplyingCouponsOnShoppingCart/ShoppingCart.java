package LLD.ApplyingCouponsOnShoppingCart;

import java.util.*;

public class ShoppingCart {
    List<Product> productList;

    ShoppingCart(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.productList.add(new ProductTypeCouponDecortor(new PercentageCouponDecorator(product, 10), 5, product.getType()));
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : productList){
            totalPrice+=product.getPrice();
        }

        return totalPrice;
    }
}
