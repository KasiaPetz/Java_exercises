package food2door;

public class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQnty() + " " + order.getProduct()
                + " from \"HealthyShop\" is ready.");
        return true;
    }

}
