package food2door;

import java.text.MessageFormat;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process(Order order) {
//        System.out.println(order.getProductQnty() + " " + order.getProduct()
//                + " from \"GlutenFreeShop\" is ready.");
        System.out.println(String.format("%d %s from \" GlutenFreeShop\" is ready. ", order.getProductQnty(), order.getProduct()));

        return true;
    }
}
