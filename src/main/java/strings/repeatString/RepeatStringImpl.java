package strings.repeatString;

public class RepeatStringImpl implements RepeatString {

    @Override
    public String repeatStr(int repeat, String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

}
