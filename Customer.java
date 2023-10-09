public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name, int cartCapacity) {
        this.name = name;
        this.cart = new ShoppingCart(cartCapacity);
    }

    public void addToCart(Product product) {
        cart.addItem(product);
    }

    public void checkout() {
        System.out.printf("%s's Order:",name);
        cart.displayCart();
        System.out.printf("Thank you %s for shopping with us !" ,name);
    }
}
