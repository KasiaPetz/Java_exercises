package strings.repeatString;

//Write a function called repeatString which repeats the given String src exactly count times.


public class RepeatStringImplWithExeption implements RepeatString {

    @Override
    public String repeatStr(int repeat, String string) {
        String s = "";

        if(repeat < 0) {
            throw new IllegalArgumentException("Number of repetitions must be greather than 0");
        }
        for (int i = 0; i < repeat; i++) {
           s = s.concat(string);
        }
        return s;
    }

    public static void main(String[] args){
        String result = null;
        try {
            RepeatString repeatString = new RepeatStringImplWithExeption();
            result = repeatString.repeatStr(0, "abc");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        System.out.println(result);
    }
}


