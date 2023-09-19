package Shape;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return width*2 + length*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
