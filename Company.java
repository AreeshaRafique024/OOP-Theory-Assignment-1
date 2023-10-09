public class Company {
    private Customer[] customers;
    private Product[] products;

    public Company(Product[] products, Customer[] customers) {
        this.products = products;
        this.customers = customers;
    }

    public void serveCustomers() {
        for (Customer customer : customers) {
            customer.checkout();
        }
    }
}
