package FirstDigit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FirstDigit {
    static void main(String[] args) {
        String inputString = "var_1__I3t";
        System.out.println(firstDigit(inputString));
    }
    static char firstDigit(String inputString) {
        int index = -1;
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find() ) if (index == -1) index = matcher.start();

        return inputString.charAt(index);
    }
}
