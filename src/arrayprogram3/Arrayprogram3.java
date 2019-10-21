/*
 * Gurjit Singh
 * Friday October 18th - 2019
 * This is the third array practice program
 */

package arrayprogram3;

/**
 *
 * @author gusin5788
 */
public class Arrayprogram3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6}; // Array declaration
        double total = 0; // total declaration
        double average; // average declaration
        
        System.out.println("These are the marks:");
        for (int i = 0; i <= 8; i = i + 1)
        {
           System.out.println(marks[i]); // Displays the marks
           total = total + marks[i]; // Adds the marks as the total
        }       
        
        average = total / 9; // Calculates the average
        
        average = average * 10; // Lines 32-34 round the average to one decimal place
        average = Math.round(average);
        average = average / 10;
        
        System.out.println("The average mark is:"); // Displays the average to the user
        System.out.println(average);
    }
    
}
