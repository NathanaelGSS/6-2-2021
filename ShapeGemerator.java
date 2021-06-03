
package smoothstack_6_2_2021_interface_shapes;
import java.util.Random;

/**
 *
 * @author Nathanael
 */
public class ShapeGemerator {


    public static void main(String[] args) {//Creates shape objects, generates numbers for calculations, and runs the methods
        Random r = new Random();//Make random numbers o calculate
        Circle c = new Circle();
        c.calculateArea(r.nextDouble() * 100);
        Rectangle s = new Rectangle();
        s.calculateArea(r.nextDouble() * 100);
        Triangle t =new Triangle();
        t.calculateArea(r.nextDouble() * 100);
        c.display();
        s.display();
        t.display();
        
        
    }
    
}
