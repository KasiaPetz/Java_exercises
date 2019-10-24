package food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(String.format("%d %s from \" ExstraFoodShop\" is ready. ", order.getProductQnty(), order.getProduct()));
        return true;
    }
}
