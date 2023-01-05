package shapes;

public class Square extends Quadrilateral{
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double setLength() {
        return side;
    }

    @Override
    public double setWidth() {
        return side;
    }
//    protected double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter(){
//        return 4 * side;
//    }
}
