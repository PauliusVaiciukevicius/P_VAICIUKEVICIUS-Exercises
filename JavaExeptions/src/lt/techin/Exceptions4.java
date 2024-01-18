package lt.techin;

import java.io.FileNotFoundException;

public class Exceptions4 {
    public static void main(String[] args) {

       int number = 20;
        unsafe(number);


    }
    private static void unsafe(int number) throws FileNotFoundException {
        if (number > 10){
            throw new FileNotFoundException();
        }
    }
}
