package lt.techin.paulius;

import java.lang.reflect.Array;

public class uzduotys {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "BMW";
        myCar.productionYear = 1992;
        myCar.color = "Black";
        System.out.println(myCar);
        Car realCar = new Car("Toyota", 2016, 1000);
        System.out.println(realCar.productionYear);
        Car otherCar = new Car("Kia", 15000);
        Car myCoolCar = new Car("Blue", "Volvo", 2023, 30000, true);
        Car[] myCars = {realCar, otherCar, myCoolCar};
        for (Car element : myCars) ;
        {
            System.out.println(element.model + " : " + element.productionYear);

        }
        if (myCoolCar.buyCar()) {
            System.out.println("pirksiu");
        } else {
            System.out.println("Nepirksiu");
        }
    }
}
