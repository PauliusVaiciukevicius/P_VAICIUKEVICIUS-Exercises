package lt.techin;

public class PD6_15 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.5, 3.5, 4.5, 25};
        if (array.length < 1) {
            System.out.println("negalime..");
        } else {
            double sum = 0;
            for (double element : array) {
                sum += element;

            }
            double average = sum / array.length;
            System.out.println(average);
            double closest = array[0];
            double minDifference = Math.abs(closest - average);
            for (int i = 0; i < array.length; i++) {
                double difference = Math.abs(array[i] - average);
                if (difference <minDifference) {
                    closest = array[i];
                    minDifference = difference;
                }

            }
            System.out.println(closest);
        }
    }
}
