package lt.techin;

public class figuros {

    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++){ //row
            for (int column = 1; column <= 10; column++){//column
                if (column == 1 || row == 10 || column == 1 || column == 10 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
