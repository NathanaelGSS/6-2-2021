
package smoothstack_6_2_2021_Command_Line;

/**
 *
 * @author Nathanael
 */
public class Smoothstack_6_2_2021_Command_Line {
    
    
    public static void main(String[] args) {//We just need a main methd to accept command line args
        // TODO code application logic here
        int total = 0;
        int additions = 0;
        for (int i = 0; i < args.length; i++) {
            try {//put it in a try/catch in case we receive non-ints
                total += Integer.parseInt(args[i]);
                additions++;
            } catch (Exception e) {
                System.out.println("Input Error! Non-int argument found: " + args[i]);//Tell the user exactly what went wrong
            }
        }
        if (additions == 0) {//Tell the user that they didn't pass any args
            System.out.println("No ints were passed!!!");
        } else {
            System.out.println("Total of command line ints: " + total);//Final answer, if ints were passed
        }
    }

}
