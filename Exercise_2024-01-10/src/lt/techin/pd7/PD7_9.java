package lt.techin.pd7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PD7_9 {
    public static void main(String[] args) {
        String text = "The Ultimate Speed";
        System.out.println(sortedChars(text));

    }
    public static String sortedChars(String text){
        char[] charArray = text.toCharArray();
        Arrays.sort(charArray);


        return new String(charArray);//cheat returninti
    }

}
