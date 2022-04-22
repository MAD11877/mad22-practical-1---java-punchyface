import java.util.Scanner;
import java.lang.Math;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */


    boolean check = true;
    int userinp = 0;
    while (check){
      check = false;
      Scanner in = new Scanner(System.in);
      try {
        System.out.print("Enter an integear: ");
        userinp = in.nextInt();
      }
      catch (Exception e){
        check = true;
        System.out.println("Input value is invalid\n");
      }
    }
    int result = (int) Math.pow(userinp,2);
    System.out.println("Result: " + result);

  }
}
