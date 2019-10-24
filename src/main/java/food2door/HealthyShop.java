package food2door;

public class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(String.format("%d %s from \" HealthyShop\" is ready. ", order.getProductQnty(), order.getProduct()));
        return true;
    }

}
