package shapes;

public class Square extends Rectangle{
    private double side;

    public Square(double side){
        this.side = side;
        super.Rectangle (side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter(){
        return 4 * side;
    }
}
