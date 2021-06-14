package Assignment2.Ex25;
import java.util.*;

public class PasswordValidator {

    public static int password_strength(String input) {
        // Checking lower alphabet in string
        int value = 0;
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password

        if (hasDigit || hasLower || hasUpper || specialChar && (n >= 8)) {
            value = 1;
        }else if ((hasLower || hasUpper || hasDigit) && (n >= 8)){
            value = 2;
        }else if((hasLower || hasUpper)&& (n < 8)){
            value = 3;
        }else if ((hasDigit) && (n < 8)){
            value =4;

        }
        return value;
    }

}




