package smoothstack_6_2_2021_2darray;

import java.util.Random;

/**
 *
 * @author Nathanael
 */
public class SmoothStack_6_2_2021_2DArray {

    static int[][] arr = new int[5][5];//Our array
    static int largest = 0;//Number we're searching for
    static int x, y, duplicates;//location is stored in x/y format, duplicates just exists for fun.

    public static void main(String[] args) {//main is just running our methods today
        System.out.println("Populating array...");
        populateArray();
        System.out.println("Finding lagest value...");
        findLargest();
    }

    public static void populateArray() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = r.nextInt(101);//double for loop is aneasy way to work through a 2d array. The 'largest' value cou;d be stored during generation, but then it isn't searching the array for it.
            }
        }
    }
    
    public static void findLargest() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] > largest) {//Once again, a double for loop
                    largest = arr[i][j];
                    x = i;//Store the crrent location when the new 'largest' value is found
                    y = j;
                } else if (arr[i][j] == largest) {
                    duplicates++;
                }
            }
        }
        System.out.println("Largest value is: " + largest + ". Found at location: " + x + "/" + y + ".");
        System.out.println("This value occured " + duplicates + " more time(s).");
    }

}
