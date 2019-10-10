package exercises.repeatString;

public class RepeatStringBuilder implements RepaeatString {

    @Override
    public String repeatStr(int repeat, String string)  {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
