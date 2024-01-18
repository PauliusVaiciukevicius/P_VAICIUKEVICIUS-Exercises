package lt.techin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Rokas", 48);
        Human human2 = new Human("Rokas", 48);

        System.out.println(human1.equals(human2));
        String text1 = new String("Labas");
        String text2 = new String("Labas");
        System.out.println(human1.equals(human2));

        }
    }

