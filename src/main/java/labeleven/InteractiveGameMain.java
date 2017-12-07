package labeleven;

import java.util.Date;
import java.util.Scanner;


/**
 *
 *
 *
 *
 *
 *
 * @author Dillon Thoma and Ben Watto
 */

public class InteractiveGameMain {

  /**
   *
   *
   *
   * To run this program, please type: gradle -q --console plain run
   *
   * @author Dillon Thoma and Ben Watto
   */

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String Decision1, Decision2, Decision3, Decision4, Decision5;
    String a = "Bad Gator!";
    //String Examine;

    System.out.println("Dillon Thoma and Ben Watto " + new Date());
    System.out.println("Welcome to Interactive Storytelling:");
    System.out.println();
    System.out.println("A Day In the Life of a Gator!");
    System.out.println();
    System.out.println("You wake up to the buzzing of your alarm. \nDo you go back to 'sleep' or 'get up' out of bed?");
    Decision1 = scan.nextLine();


    if (Decision1.equalsIgnoreCase("get up")) {
        //while (true) {
        System.out.println();
        System.out.println("You go to your first class of the day, and need to decide where to eat. \nDo you want to eat at 'Brooks' or 'Kins'?");
        //if else (.equalsIgnoreCase("examine"))
        //System.out.println("Theres stuff man")
        Decision2 = scan.nextLine();

        if (Decision2.equalsIgnoreCase("Kins")) {
            System.out.println();
            System.out.println("Good choice. \nWhat do you want to eat? 'Cantina' or 'Pasta'?");
            Decision3 = scan.nextLine();

            if (Decision3.equalsIgnoreCase("Cantina")) {
                System.out.println();
                System.out.println("You enjoy your lunch and head to your afternoon classes. \nAfter class, do you want to do 'homework' or take a 'nap'?");
                Decision4 = scan.nextLine();

                if (Decision4.equalsIgnoreCase("homework")) {
                    System.out.println();
                    System.out.println("Way to be a responsible Gator! \nIt's almost dinner time! Do you want 'Chipotle' or 'Taco Bell'?");
                    Decision5 = scan.nextLine();

                    if (Decision5.equalsIgnoreCase("Taco Bell")) {
                        System.out.println();
                        System.out.println("$12 for 12 tacos? Best investment of your life! \nWay to be a financially responsible Gator!");

                      } else if (Decision5.equalsIgnoreCase("Chipotle")) {
                          System.out.println();
                          System.out.println("You got a flat tire on your way to Pittsburgh!");
                          System.out.println(a);
                        }

                } else if (Decision4.equalsIgnoreCase("nap")) {
                      System.out.println();
                      System.out.println("You procrastinated too much, and failed out of your classes!");
                      System.out.println(a);
                  }

            } else if (Decision3.equalsIgnoreCase("Pasta")) {
                System.out.println();
                System.out.println("You spend all your munch money and starve!");
                System.out.println(a);
              }

        } else if (Decision2.equalsIgnoreCase("Brooks")) {
            System.out.println("Risky move, Gator. Do you want to go straight to 'Slice' or try the 'Main' Line?");
            System.out.println();
            Decision3 = scan.nextLine();

            if (Decision3.equalsIgnoreCase("Main")) {
                System.out.println();
                System.out.println("Can't go wrong on mac & cheese day! Good move!");
                System.out.println("'Ice Cream' or 'No' ice cream?");
                Decision4 = scan.nextLine();

                if (Decision4.equalsIgnoreCase("Ice Cream")) {
                    System.out.println();
                    System.out.println("You get sick and miss your afternoon classes!");
                    System.out.println(a);

                } else if (Decision4.equalsIgnoreCase("No")) {
                      System.out.println();
                      System.out.println("Way to be healthy!");
                  }



            } else if (Decision3.equalsIgnoreCase("Slice")) {
                System.out.println();
                System.out.println("There is no cheese pizza today; only leftovers from last week on a pizza!");
                System.out.println("You get food poisining and miss your afternoon classes!");
                System.out.println(a);
              }
            }
  } else if (Decision1.equalsIgnoreCase("sleep")) {
      System.out.println();
      System.out.println("You sleep through the whole day, and fail out!");
      System.out.println(a);
      }
}
}
