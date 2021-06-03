package smoothstack_6_2_2021_interface_shapes;

public class Triangle implements ShapeInterface {

    double side, area;//equilateral triangles have an easier formula
    @Override
    public void calculateArea(double dimension) {
        side = dimension;
        area = (side * side * Math.sqrt(3))/4;
    }

    @Override
    public void display() {
        System.out.println("Triandgle side is: " + side + " (calculations done as an equilateral triangle)");
        System.out.println("Triangle area is: " + area);
    }
    
}
