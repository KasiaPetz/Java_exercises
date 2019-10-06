package food2door;

public class OrderProcessor {

    public boolean prodessOrder(OrderRequest orderRequest) {
        final Producer producer = orderRequest.getProducer();
        final Order order = orderRequest.getOrder();

        return producer.process(order);
    }
}
