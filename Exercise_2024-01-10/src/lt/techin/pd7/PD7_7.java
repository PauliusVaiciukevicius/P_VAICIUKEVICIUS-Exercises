package lt.techin.pd7;

public class PD7_7 {
    public static void main(String[] args) {
        int number = 54;//50 +4
        System.out.println(reverseNumber(number));
    }
    public static int reverseNumber(int number){
        int reversed = 0;
        while(number !=0){
            int remainder = number % 10;
            reversed =  reversed * 10 + remainder;
            number = number / 10;

        }
return reversed;
    }
}
