package Assignment2.Ex24;

import java.util.Arrays;

public class Anagram {


   public boolean find_anagram(String word1, String word2) {


      if (word1.length() != word2.length()) {
         return false;
      }
      char[] x = word1.toCharArray();
      char[] y = word2.toCharArray();

      Arrays.sort(x);
      Arrays.sort(y);

      return Arrays.equals(x,y);

   }
}
