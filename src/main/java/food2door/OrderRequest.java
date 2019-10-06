package food2door;

public class OrderRequest {

    private Producer producer;
    private Order order;

    public OrderRequest(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
