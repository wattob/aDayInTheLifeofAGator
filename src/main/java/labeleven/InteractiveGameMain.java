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

    if (Decision1.equalsIgnoreCase("get up")) {
        System.out.println("You get out of bed and get into a nice, lukewarm shower.");
        System.out.println("On the way to class you see a monster. \nDo you 'kick' or 'pet' it?");
        Decision2 = scan.next();

      if(Decision2.equalsIgnoreCase("pet")) {
        System.out.println("You were bitten! Now you need a rabies shot.");
        System.out.println("Game Over!")
    }
      } else if (Decision2.equalsIgnoreCase("kick")) {
          System.out.println();
          System.out.println("You dang monster you! Good work protecting the campus.");
          System.out.println();
          System.out.println("You now walk into Brooks to get yourself some lunch. \nDo you get food from the 'main line' or head straight to 'slice'?");
          Decision3 = scan.next();

          if (Decision3.equalsIgnoreCase("main line")) {
            System.out.println();
            System.out.println("You get food poisining!")
            System.out.println("Game Over!");
        //  } else if (Decision4.equalsIgnoreCase())
       }
    } else if (Decision1.equalsIgnoreCase("sleep")) {
      System.out.println("You sleep through all of your classes and fail out. Nice work!");
      System.out.println("Game Over!");
        Decision2 = scan.next();


      }
    }
  }
}
}
