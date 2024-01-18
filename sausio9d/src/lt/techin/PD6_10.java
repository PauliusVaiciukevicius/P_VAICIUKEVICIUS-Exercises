package lt.techin;

import java.util.Arrays;

public class PD6_10 {
    public static void main(String[] args) {
        int[] numbersArr1 = {1, 2, 3, 4, 5};
        int[] numbersArr2 = {3, 4, 5, 6, 7};
        int[] sujungtasMasyvas = new int[numbersArr1.length + numbersArr2.length];
        int index = 0;
        for (int elArr1 : numbersArr1){
            sujungtasMasyvas[index++] = elArr1;

        }
        for (int elArr2 : numbersArr2){
            sujungtasMasyvas[index++] = elArr2;

        }
        System.out.println(Arrays.toString(sujungtasMasyvas));
    }
}
//todo paimti is 6_8
