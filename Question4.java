import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

    boolean check = true;
    int userinp = 0;
    while (check){
      check = false;
      Scanner in = new Scanner(System.in);
      try {
        System.out.print("Enter an integer: ");
        userinp = in.nextInt();
      }
      catch (Exception e){
        check = true;
        System.out.println("Input value is invalid\n");
      }
    }
    for (int i = userinp; i > 0; i--){
      System.out.println("*".repeat(i));
    }


  }
}
