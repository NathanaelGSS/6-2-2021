package smoothstack_6_2_2021_interface_shapes;


public class Circle implements ShapeInterface {
    
    double radius, area;//Pretty standard circle suff
    
    @Override
    public void calculateArea(double dimension) {
        radius = dimension;
        area = Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle radius given: " + radius);
        System.out.println("Area calculated: " + area);
    }
}
