package labeleven;

import java.util.Scanner;
// public class must match the name of the program.
public class InteractiveGameMain {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String Decision1, Decision2, Decision3, Decision4, Decision5;
    System.out.println();
    System.out.println("Welcome to Interactive Storytelling:");
    System.out.println();
    System.out.println("A Day In the Life of a Gator!");
    System.out.println();
    System.out.println("You wake up to the buzzing of your alarm. \nDo you go back to 'sleep' or 'get up' out of bed?");
    Decision1 = scan.next();

    if(Decision1.equalsIgnoreCase("sleep")) {
      System.out.println("You sleep through all of your classes and fail out. Nice work!");
        if(Decision1.equalsIgnoreCase("get up")) {
          System.out.println("You get out of bed and get into a nice, lukewarm shower.");
        }
    }
  }
}
