package LLD.ApplyingCouponsOnShoppingCart;

public class PercentageCouponDecorator extends CouponDecorator {

    Product product;
    int percentageDiscount;

    PercentageCouponDecorator(Product product, int percentageDiscount){
        this.product = product;
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public double getPrice(){
        double productPrice = product.getPrice();
        return productPrice - (productPrice * percentageDiscount)/100;
    }
}
