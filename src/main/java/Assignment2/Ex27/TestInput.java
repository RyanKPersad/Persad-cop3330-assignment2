package Assignment2.Ex27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestInput {

    public static int Validate_name(String name){
        int name_result;

        if(name.matches("^[a-zA-Z]+$")&&(name.length())>2){
            name_result =1;

        }else{
            name_result =2;

        }

        return name_result;
    }
    public static int Validate_lastname(String lastname){
        int lastname_result;

        if(lastname.matches("^[a-zA-Z]+$")&&(lastname.length())>2){
            lastname_result =1;

        }else{
            lastname_result =2;

        }

        return lastname_result;
    }

    public static int Validate_ID(String id) {
        int ID_result;
        // Checking lower alphabet in string
        int n = id.length();
        boolean hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList( '-'));
        for (char i : id.toCharArray()) {

            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        if (hasUpper && hasDigit && specialChar && (n==7)) {
            ID_result = 1;
        } else {
            ID_result = 2;

        }


        return ID_result;
    }

    public static int validate_zipcode(String Zipcode){
        int zip_result;
        int l = Zipcode.length();
        if (Zipcode.matches("^[0-9]+$") &&(l==5) ){
            zip_result = 1;


        }else{

            zip_result =2;
        }

        return zip_result;
    }

}
