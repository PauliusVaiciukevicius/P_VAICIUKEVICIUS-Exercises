package lt.techin.pd7;

import java.math.BigInteger;

public class PD7_5 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(countNumbFactorial(number));
    }
    public static BigInteger countNumbFactorial(int number){
        if (number < 0){
            return BigInteger.ZERO;//0
        } else {
    BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i < number; i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));

            }
            return factorial;

        }

    }
}
