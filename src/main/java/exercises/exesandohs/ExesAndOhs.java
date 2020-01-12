package exercises.exesandohs;

public class ExesAndOhs {

    //String input = "xoxoxoxox";
    //char[] inputArray = input.toCharArray();            // string na tablice charów

    public boolean checkXO(String input) {
        int oCounter = 0;
        int xCounter = 0;
        input = input.toLowerCase();

        for(char c : input.toCharArray()) {
            if (c == 'x') {
                xCounter++;
            } else if(c == 'o') {
                oCounter++;
            }
        }
        return oCounter == xCounter;    //zwraca true lub false
    }
}
