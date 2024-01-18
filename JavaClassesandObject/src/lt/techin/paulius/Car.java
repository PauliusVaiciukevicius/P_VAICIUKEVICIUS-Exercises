package lt.techin.paulius;

public class Car {
        String color;
        String model;
        int productionYear;
        double price;
        boolean canDrive;

        //default constructor
        public Car(){}

    public Car(String color, String model, int productionYear, double price, boolean canDrive) {
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
        this.canDrive = canDrive;
    }

    //constructor
        public Car(String model, int productionYear, double price){
            this.model = model;
            this.productionYear = productionYear;
            this.price = price;
        }
        boolean buyCar() {
            if (canDrive);
            System.out.println("we cam buy this car");
            return true;

        }
        return false;

    }

