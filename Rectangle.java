package smoothstack_6_2_2021_interface_shapes;


public class Rectangle implements ShapeInterface {
    
    double sideLength, area;//Just making a square for the formula's sake
    @Override
    public void calculateArea(double dimension) {
        sideLength = dimension;
        area = sideLength * 4;//Just a square, still a 'rectangle'
    }

    @Override
    public void display() {
        System.out.println("Rectangle Side lengths: " + sideLength + " (calculaed as a square)");
        System.out.println("Retangle area: " + area);
    }
    
}
