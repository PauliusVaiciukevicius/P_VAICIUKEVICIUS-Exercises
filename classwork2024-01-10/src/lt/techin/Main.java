package lt.techin;

public class Main {
    public static void main(String[] args) {
//        Box myBox1 = new Box();
//       myBox1.setLength(-10);
//        myBox1.setHeight(-20);
//       myBox1.setWidth(8);
//        double volume1 = myBox1.showVolume();
//        System.out.println("myBox1" + volume1);
//        Box myBox2 = new Box();
//        myBox2.height = 5.6;
//        myBox2.length = 10.4;
//        myBox2.width = 10.8;
//        double volume2 = myBox2.showVolume();
//        System.out.println(volume2);
//        Box myBox3 = new Box(15, 45, 48);
//        System.out.println(myBox3.showVolume());
//        Box myBox4 = new Box(15);
//        System.out.println(myBox4.showVolume());
//        Box myBox5 = new Box(-15);
//        System.out.println(myBox5.showVolume());

//        System.out.println("Kazkas?" + Box.showVolume());
//        Student student1 = new Student("Saulius", 30);
//        Student student2 = new Student("Paulius", 35);
//        System.out.println(Student.studentCounter);

        Animal animal1 = new Animal("Bird", 4);
        Animal animal2 = new Animal("Cat", 10);

        animal1.makeSound();
        animal2.makeSound();

        Bird bird1 = new Bird("Pingvinas", 2);
        Cat cat1 = new Cat("Rainis", 10);

        bird1.makeSound();
        cat1.makeSound();
    }
 //   MyMath myMath = new MyMath(10);
//    myMath PI = 3.1428;
 //       System.out.println(myMath.getArea());


}
