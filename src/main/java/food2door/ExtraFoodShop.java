package food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQnty() + " " + order.getProduct()
                + " from \"ExtraFoodShop\" is ready.");
        return true;
    }
}
