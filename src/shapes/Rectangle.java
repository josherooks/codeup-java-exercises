package shapes;

public class Rectangle {
    private double length;
    private double width;

    public void Rectangle(double length, double width){
        this.length =length;
        this.width = width;

    }

    public double getArea(){
        return length * width;

    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
