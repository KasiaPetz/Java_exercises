package recursion;

// {warunek} ? {wartość pierwsza} : {wartość druga}
// jesli warunek true to wartoscia wyrazenia jest wart pierwsza jesli false to druga

public class OperatorTrojargumentowy {

    public String isEven(int x) {
        return x % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        OperatorTrojargumentowy op = new OperatorTrojargumentowy();

        System.out.println(op.isEven(8));
        System.out.println(op.isEven(3));
    }
}
