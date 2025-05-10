package LLD.ApplyingCouponsOnShoppingCart;

public class CheckoutCounter {
    public static void main(String[] args) {
        
        Product product1 = new Product1("Iphone", 60000, ProductType.ELECTRONICS);
        Product product2 = new Product2("Soap", 50, ProductType.GROCERIES);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product1);
        System.out.println("Total price after discount is "+shoppingCart.getTotalPrice());
    }
}
