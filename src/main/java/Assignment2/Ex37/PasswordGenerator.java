package Assignment2.Ex37;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
public class PasswordGenerator {

    public static void Create_a_Password(){
        Scanner in = new Scanner(System.in);

        List<Character> special = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        Random random = new Random();
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }

        String nums = "0123456789";
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        List<Character> numbers = new ArrayList<>();
        for(char ch: nums.toCharArray()){
            numbers.add(ch);
        }

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Character> alphabets = new ArrayList<>();
        for(char ch: letters.toCharArray()){
            alphabets.add(ch);
        }

        System.out.print("What's the minimum length? ");
        int n = in.nextInt();
        System.out.print("How many special characters? ");
        int specialCount = in.nextInt();
        System.out.print("How many numbers? ");
        int numCount = in.nextInt();

        String password = "";


        for(int i=0;i<n-specialCount-numCount;i++){
            password+= alphabets.get(random.nextInt(alphabets.size()));
        }

        for(int i=0;i<specialCount;i++){
            password+= special.get(random.nextInt(special.size()));
        }

        for(int i=0;i<numCount;i++){
            password+=numbers.get(random.nextInt(numbers.size()));
        }


        char arr[] = password.toCharArray();
        for(int i=arr.length-1;i>0;i--){
            int j = random.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new String(arr);

        System.out.println("Your password is "+password);
    }


}

