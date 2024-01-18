package lt.techin.exercises;

import java.util.Scanner;

public class PD2_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");

        System.out.println("a\t\tb\tc");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please impute your name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
