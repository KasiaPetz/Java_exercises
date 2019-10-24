package food2door;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process(Order order) {
//        System.out.println(order.getProductQnty() + " " + order.getProduct()
//                + " from \"GlutenFreeShop\" is ready.");
        System.out.println(String.format("%d %s from \" GlutenFreeShop\" is ready. ", order.getProductQnty(), order.getProduct()));
        return true;
    }
}

//System.out.println(String.Format( "%s  %d from \"GlutenFreeShop\" is ready.",order.getProductQnty(), order.getProduct()));

//
//public class Main {
//    public static void main(String []args){
//        int x = 5, y = 4;
//        System.out.println(String.format("%d * %d = %d", x, y, x * y));
//    }
//}

//%s	any type	String value
//%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer