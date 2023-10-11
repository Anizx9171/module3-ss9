package th1.Shapes;

import th1.Shape;

public class Squad implements Shape {
    private double width;
    private double height;
    @Override
    public void resize(double percent) {
        this.height += this.height * (percent/100);
        this.width += this.width * (percent/100);
    }
    public double area(){
        return this.width*this.height;
    }
    public double perimeter(){
        return (this.width+this.height)*2;
    }

}
