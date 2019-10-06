package food2door;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println(order.getProductQnty() + " " + order.getProduct()
                + " from \"GlutenFreeShop\" is ready.");
        return true;
    }
}

