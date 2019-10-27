package strings;

import java.text.MessageFormat;

public class FormatExample {

    public static void main(String[] args) {

        System.out.println(MessageFormat.format("wall of text wall {0} of textwall of textwall of textwall of textwall of textwall of textwall of text" +
                "wall of textwall of textwall of textwall of textwall of textwall of textwall of textwall of text" +
                "wall of textwall of textwall of textwall of textwall of textwall {1} of textwall of textwall of text" +
                "wall of textwall of textwall of textwall of textwall of textwall of textwall of text" +
                "wall of textwall of textwall {2} of textwall of textwall of textwall of textwall of textwall of textwall of textwall of text", 5, 10, 15));

        System.out.println(String.format("Example of string format %d, %d, %d",5, 10, 15));

    }
}

//
//public class Main {
//    public static void main(String []args){
//        int x = 5, y = 4;
//        System.out.println(String.format("%d * %d = %d", x, y, x * y));
//    }
//}

//%s	any type	String value
//%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
