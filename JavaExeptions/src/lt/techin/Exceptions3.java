package lt.techin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");

        }

    }
}
