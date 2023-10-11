package th1.Shapes;

import th1.Shape;

public class Circle implements Shape {
    private double r;
    private final double PI = 3.141;

    @Override
    public void resize(double percent) {
        this.r += this.r * (percent/100);
    }
    public double area(){
        return this.r*this.r*this.PI;
    }
    public double perimeter(){
        return (this.r+this.r)*this.PI;
    }
}
