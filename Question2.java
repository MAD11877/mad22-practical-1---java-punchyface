import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    boolean check = true;
    double weight = 0;
    double height = 0;
    while (check){
      check = false;
      Scanner in = new Scanner(System.in);
      try {
        System.out.print("Enter height (m): ");
        height = in.nextDouble();
        System.out.print("Enter weight (Kg): ");
        weight = in.nextDouble();
      }
      catch (Exception e){
        check = true;
        System.out.println("Input value is invalid\n");
      }
    }
    double bmi = weight / Math.pow(height,2);
    //DecimalFormat dp2 = new DecimalFormat("#0.00");
    //System.out.println("Bmi: " + dp2.format(bmi));
    System.out.println(bmi);
  }
}
