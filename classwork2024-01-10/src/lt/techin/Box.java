package lt.techin;

public class Box {
   private static double length;
    private static double width;
    private static double height;

    public Box (){
        length = 10;
        width = 10;
        height = 10;
    }
    public Box(double length, double width, double height){
      setLength(length);
      setWidth(width);
      setHeight(height);

    }
    public Box(double borderSize) {
        setLength(borderSize);
        setWidth(borderSize);
        setHeight(borderSize);
    }
    public static double showVolume(){
       return length * height * width;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.out.println("Incorrect Box size!");
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Incorrect Box size!");
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
            if (height <= 0){
                System.out.println("Incorrect Box size!");
            } else {
                this.height = height;
        }

    }
}



