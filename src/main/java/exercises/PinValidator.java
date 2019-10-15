package exercises;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.

public class PinValidator {

    public boolean validatePin(String pin) {
        if((pin.length() !=4 && pin.length() != 6) || pin.matches("\\D+")) {
            return false;
        }
        return true;
    }
}

//
//    public static boolean validatePin(String pin) {
//
//        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
//            return false;
//        }
//
//        for (int i = 0; i < pin.length(); i++) {
//            if (!Character.isDigit(pin.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}