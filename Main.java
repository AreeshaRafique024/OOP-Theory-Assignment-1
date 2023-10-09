public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 999.99, Category.ELECTRONICS),
            new Product("T-Shirt", 19.99, Category.CLOTHING),
            new Product("Java Programming Book", 49.99, Category.BOOKS)
        };

        Customer[] customers = {
            new Customer("John", 2),
            new Customer("Alice", 2)
        };

        customers[0].addToCart(products[0]);
        customers[0].addToCart(products[1]);
        customers[1].addToCart(products[0]);
        customers[1].addToCart(products[2]);

        Company company = new Company(products, customers);
        company.serveCustomers();
    }
}
