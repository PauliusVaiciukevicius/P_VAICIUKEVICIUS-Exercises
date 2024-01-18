/*parasyti ar du masyvai turi bent viena bendra elementa.

 */

package lt.techin;

public class PD6_14 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 22, 30, 40, 50};
        boolean haCommonElement = false;
        for (int number1 : numbers1){
            for (int number2 : numbers2) {
                if (number1 == number2){
                    haCommonElement = true;
                    break;
                }
            }
        }
    }
}
