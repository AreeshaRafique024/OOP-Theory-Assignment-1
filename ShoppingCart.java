public class ShoppingCart {
    private Product[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        items = new Product[capacity];
        itemCount = 0;
    }

    public void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount] = product;
            itemCount++;
        } else {
            System.out.println("Shopping cart is full.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
        System.out.printf("Total: %.2f PKR" ,calculateTotal());
    }
}
