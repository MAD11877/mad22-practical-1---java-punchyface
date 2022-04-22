import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     *
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    HashMap<Integer, Integer> numdict = new HashMap<>();
    boolean check0 = true;
    int numofint = 0;
    while (check0) {
      check0 = false;
      Scanner obj = new Scanner(System.in);
      try {
        System.out.print("Enter of integer for input: ");
        numofint = obj.nextInt();
      } catch (Exception e) {
        check0 = true;
        System.out.println("Input value is invalid\n");
      }
    }
    for (int index = 0; index < numofint; index++) {
      boolean check = true;
      int userinp = 0;
      while (check) {
        check = false;
        Scanner in = new Scanner(System.in);
        try {
          System.out.print("Enter an integer: ");
          userinp = in.nextInt();
        } catch (Exception e) {
          check = true;
          System.out.println("Input value is invalid\n");
        }
      }
      if (numdict.containsKey(userinp) == false) {
        numdict.put(userinp, 1);
      } else {
        numdict.replace(userinp, numdict.get(userinp), numdict.get(userinp) + 1);
      }
    }
    String highestfrequency = "";
    int maxValueInNumdict=(Collections.max(numdict.values()));
    for(int obj : numdict.keySet())
    {
      if (numdict.get(obj) == maxValueInNumdict){
        highestfrequency += obj + ", ";
      }
    }
    System.out.println("Highest occurrence: " + highestfrequency.substring(0, highestfrequency.length()-2));
  }
}
