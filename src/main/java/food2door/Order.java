package food2door;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private String product;
    private int productQnty;

    public Order(int orderId, LocalDate orderDate, String product, int productQnty) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.product = product;
        this.productQnty = productQnty;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProductQnty() {
        return productQnty;
    }

    public void setProductQnty(int productQnty) {
        this.productQnty = productQnty;
    }
}
