package labeleven;

import java.util.Scanner;
// public class must match the name of the program.
public class InteractiveGameMain {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String Decision1, Decision2, Decision3, Decision4, Decision5;

    System.out.println("Welcome to Interactive Storytelling:");
    System.out.println();
    System.out.println("A Day In the Life of a Gator!");
    System.out.println();
    System.out.println("You wake up to the buzzing of your alarm. \nDo you go back to 'sleep' or 'get up' out of bed?");
    Decision1 = scan.nextLine();

    if (Decision1.equalsIgnoreCase("get up")) {
        System.out.println();
        System.out.println("you do stuff 'stuff' yay or yeah the other 'thing' man");
        Decision2 = scan.nextLine();

        if (Decision2.equalsIgnoreCase("stuff")) {
            System.out.println();
            System.out.println(" wow theres stuff \nWould you like to eat some of the food, 'Yes' or 'No'?");
            Decision3 = scan.nextLine();

            if (Decision3.equalsIgnoreCase("Yes")) {
                System.out.println();
                System.out.println("You live!");
            } else if (Decision3.equalsIgnoreCase("No")) {
                System.out.println();
                System.out.println("You lose!");
              }
        } else if (Decision2.equalsIgnoreCase("thing")) {
            System.out.println("There is a puppy inside. Do you want to 'fight' it, or 'run away'?");
            System.out.println();
            Decision3 = scan.nextLine();

            if (Decision3.equalsIgnoreCase("fight")) {
                System.out.println();
                System.out.println("You did it!");
            } else if (Decision3.equalsIgnoreCase("run away")) {
                System.out.println();
                System.out.println("the puppy is too fast and you died");
      }
    }
  }
}
}
