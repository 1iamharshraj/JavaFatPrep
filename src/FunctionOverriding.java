class shape{
    public void calculateArea(){
        System.out.println("hello");
    }
}

class Circle extends shape{
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        double res = 3.14*radius*radius;
        System.out.println(res);
    }
}


class Rectangle extends shape{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void calculateArea(){
        double res = length*width;
        System.out.println(res);
    }

}

public class FunctionOverriding {
    public static void main(String[] args) {
        Circle cir = new Circle(5.0);
        cir.calculateArea();
        Rectangle r = new Rectangle(3.0, 3.0);
        r.calculateArea();
    }
}

