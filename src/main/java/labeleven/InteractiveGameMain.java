package labeleven;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;



/** This class has a method that will take the user throught a series of Decisions
 * that they will have to choose between in order to achieve the end goal of making it
 * through a day in the life of an Allegheny student. Each decision leads the user
 * down a different pathway, some of which will prompt the user to try again or quit the
 * program, and some that display a congratulatory message when they make it through the day.
 *
 * @author Dillon Thoma and Ben Watto
 */

public class InteractiveGameMain {

  /** The source code inside this method will be executed when the program is run.
   * To run this program, please type: gradle -q --console plain run.
   * The output of this program will appear in the terminal window as questions for
   * the user to answer, each answer prompting a different question based on the previous.
   * The print line statements make the program display the output.
   *
   */

  public static void main(String[] args) {

    /** The public static void is declared along with the arguements.
      * A scanner is created to read in the inputs from the user.
      * Strings are declared to represent each choice for the decisions the user makes.
      * Strings are used in printline statements for ease of the creators.
      * The boolean is set to true to correctly use the Label.
      */

    // trying to create an instance of a class/create an object
    GreekFight myFight = new GreekFight();


    /** An ArrayList is declared below.
      * Strings are stored in the container then retrieved to print the message.
      * The strings also appear in the list.txt file.
      */

    ArrayList<String> list = new ArrayList<String>();
    String item1 = "\tWelcome to Interactive Storytelling:";
    String item2 = "\tA Day In the Life of a Gator!";
    String item3 = "\tDillon Thoma and Ben Watto";

    /** The items in the ArrayList are added and then printed using a for loop.
     * The for loop continues from 0 to 3 to produce all three items. l++ is used
     * to represent the list.
     */

    list.add(item1);
    list.add(item2);
    list.add(item3);

    for (int l = 0; l < 3; l++) {
      System.out.println(list.get(l));
    }

    /* Scanner scan = new Scanner(System.in) is declared closer to the first use
     * to prevent checkstyle error.
     */

    /* String decisionOne is declared closer to the first use to
     * prevent checkstyle error.
     */

    String decisionTwo;
    String decisionThree;
    String decisionFour;
    String decisionFive;
    String decisionSix;
    String decisionSeven;
    String badGator = "\tBad Gator!";
    String congratsGator = "\tCongratulations! You made it through a day in the life of a Gator!";
    String invalidCommand = "\tINVALID COMMAND. Enter one of the two options listed above.";
    String quitGame = "\tGAME OVER.\n\tThanks for playing!";
    String tryAgain = "\tDo you want to 'try again' or 'quit' the program?";
    Boolean running = true;
    Decisions decisions = new Decisions();

    /** Strings are declared for each decision and shortcuts for the program's responses
     * The boolean running is set to true to correctly function with the label.
     */


    /** The source code will execute when the program is run.
     * The output will appear in the terminal window.The print line statements
     * display the output. Today's date is produced as well as the authors of
     * the program.
     */

    System.out.println("\t" + new Date());
    System.out.println();

    int age;
    System.out.println("\tPlease enter your age.");
    Scanner scan = new Scanner(System.in);
    age = scan.nextInt();
    // the age is read in from the user.

    /** If the are the proper age for college then the program will welcome them,
     * but if they are too old or too young the program will ask why they are in
     * college.
     */
    if (age >= 17 && age <= 23) {
      System.out.println();
      System.out.println("\tWelcome fellow Gator! Let's begin our journey!");
    } else {
      System.out.println("\tWhat are you doing at a college? You're not the right age!"
                          + "\n\tOh well, let's begin our journey!");

    }
    String decisionOne;
    decisionOne = scan.nextLine();

    /** label used in the 'try again' feature. If try again is typed it will start from here.
     * but if 'quit' is typed a break is used to end the program and produce the final output.
     */

    JOURNEY:
    while (running) {
      System.out.println();
      System.out.println("\tYou wake up to the buzzing of your alarm."
                           + "\n\tDo you go back to 'sleep' or 'get up' out of bed?");
      decisionOne = scan.nextLine();

      // used to print invalid command if input other than those stated is used.
      while (!decisionOne.equalsIgnoreCase("sleep") && !decisionOne.equalsIgnoreCase("get up")) {
        System.out.println(invalidCommand);
        decisionOne = scan.nextLine();
      }

      /** When 'get up' is chosen, output is printed in the terminal.
        * Following that another questions is asked using a similar method.
        */
      if (decisionOne.equalsIgnoreCase("get up")) {
        System.out.println();
        System.out.println("\tYou go to your first class of the day, and need to"
                          + " decide where to eat for lunch. \n\tDo you want to eat at "
                          + "'Brooks' or 'Kins'?");
        decisionTwo = scan.nextLine();

          // used to print invalid command if input other than those stated is used.
          while (!decisionTwo.equalsIgnoreCase("Brooks") && !decisionTwo.equalsIgnoreCase("Kins")) {
            System.out.println(invalidCommand);
            decisionTwo = scan.nextLine();
          }

          /** When 'kins' is chosen, output is printed in the terminal.
           *  Another question follows the input recieved.
           */
          if (decisionTwo.equalsIgnoreCase("Kins")) {
              System.out.println();
              System.out.println("\tGood choice. \n\tWhat do you want to eat?"
                                + " 'Cantina' or 'Pasta'?");
              decisionThree = scan.nextLine();

              // used to print invalid command if input other than those stated is used.
              while (!decisionThree.equalsIgnoreCase("Cantina")
                    && !decisionThree.equalsIgnoreCase("Pasta")) {
                System.out.println(invalidCommand);
                decisionThree = scan.nextLine();
              }

              /** if 'kins' is chosen, the user than chooses between Cantina or pasta.
               * Another decision follows depending on the choice made.
               */
              if (decisionThree.equalsIgnoreCase("Cantina")) {
                System.out.println();
                System.out.println("\tYou enjoy your lunch and head to your "
                                  + "afternoon classes. \n\tAfter class, do you "
                                  + "want to do 'homework' or take a 'nap'?");
                decisionFour = scan.nextLine();

                // used to print invalid command if input other than those stated is used.
                while (!decisionFour.equalsIgnoreCase("homework")
                      && !decisionFour.equalsIgnoreCase("nap")) {
                  System.out.println(invalidCommand);
                  decisionFour = scan.nextLine();
                }

                /** When 'cantina' is typed, another prompt will appear.
                  * if and else if conditonal logic is used to determine what is produced
                  * from the users input.
                  * If the user selcects 'nap' then the program will end and the user
                  * will be asked if they want to 'try again', but if they choose homework
                  * more prompts will appear to continue along their day.
                  */
                if (decisionFour.equalsIgnoreCase("homework")) {
                  System.out.println();
                  System.out.println("\tWay to be a responsible Gator! \n\tIt's "
                                    + "almost dinner time! Do you want 'Chipotle' or 'Taco Bell'?");
                  decisionFive = scan.nextLine();

                  // used to print invalid command if input other than those stated is used.
                  while (!decisionFive.equalsIgnoreCase("Chipotle")
                        && !decisionFive.equalsIgnoreCase("Taco Bell")) {
                    System.out.println(invalidCommand);
                    decisionFive = scan.nextLine();
                  }

                  /**Following the answer of 'homework' the user is asked where they want dinner.
                    * If the user choices Chipotle, their car will break down because
                    * the nearest one is in Erie.But if the user inputs Taco Bell
                    * they will recieve the final question.
                    */
                  if (decisionFive.equalsIgnoreCase("Taco Bell")) {
                    System.out.println();
                    System.out.println("\t$12 for 12 tacos? Best investment of your "
                                      + "life! \n\tWay to be a financially responsible "
                                      + "Gator!");
                    System.out.println();
                    System.out.println("\tOn the way back, your buddy asks you to "
                                      + "go to a party, \n\tbut you could be studying "
                                      + "for an exam coming up.");
                    System.out.println("\tDo you go to the 'party' or study at the 'library'?");
                    decisionSeven = scan.nextLine();

                  // used to print invalid command if input other than those stated is used.
                  while (!decisionSeven.equalsIgnoreCase("library")
                        && !decisionSeven.equalsIgnoreCase("party")) {
                    System.out.println(invalidCommand);
                    decisionSeven = scan.nextLine();
                  }

                  /** If 'Party' is selected than the program will ask the user
                    * if they want to 'try again' or 'quit' the program
                    */
                  if (decisionSeven.equalsIgnoreCase("party")) {
                    System.out.println();
                    System.out.println("\tYou drink too much and get sick. "
                                      + "Next stop, dropping out!");
                    System.out.println(badGator);
                    System.out.println();
                    System.out.println(tryAgain);
                    decisionSix = scan.nextLine();

                  // Used to print invalid command if input other than those stated is used.
                  while (!decisionSix.equalsIgnoreCase("try again")
                        && !decisionSix.equalsIgnoreCase("quit")) {
                      System.out.println(invalidCommand);
                      decisionSix = scan.nextLine();
                  }
                  if (decisionSix.equalsIgnoreCase("try again")) {
                    System.out.println();
                      continue JOURNEY;
                  } else if (decisionSix.equalsIgnoreCase("quit")) {
                    System.out.println(quitGame);
                      break;
                  }

                  } else if (decisionSeven.equalsIgnoreCase("library")) {
                      System.out.println();
                      System.out.println("\tYou get a great study session in and "
                                        + "head to bed \n\tat a reasonable hour!");
                      System.out.println(congratsGator);
                      /** Object oriented list used to print out the decisions, after
                       * the program is completed running is set to false
                       * to exit the program.
                       */
                      running = false;
                      decisions.addDecisions(decisionOne, decisionTwo, decisionThree,
                                            decisionFour, decisionFive, decisionSeven);
                      decisions.printDecisions();
                    }

                } else if (decisionFive.equalsIgnoreCase("Chipotle")) {
                    System.out.println();
                    System.out.println("\tThe nearest Chipotle is in Erie, "
                                      + "and you get a flat tire on the way!");
                    System.out.println(badGator);
                    System.out.println();
                    System.out.println(tryAgain);
                    decisionSix = scan.nextLine();

                  // used to print invalid command if input other than those stated is used.
                  while (!decisionSix.equalsIgnoreCase("try again")
                        && !decisionSix.equalsIgnoreCase("quit")) {
                    System.out.println(invalidCommand);
                    decisionSix = scan.nextLine();
                  }
                /** If 'try again' is selected than the program will
                  * continue from the Label,
                  * but if 'quit' is selected the program will end.
                  */
                if (decisionSix.equalsIgnoreCase("try again")) {
                  System.out.println();
                    continue JOURNEY;
                } else if (decisionSix.equalsIgnoreCase("quit")) {
                  System.out.println(quitGame);
                    break;
                }
                  }

                } else if (decisionFour.equalsIgnoreCase("nap")) {
                  System.out.println();
                  System.out.println("\tYou procrastinated too much, and failed "
                                    + "out of your classes!");
                  System.out.println(badGator);
                  System.out.println();
                  System.out.println(tryAgain);
                  decisionSix = scan.nextLine();

                // used to print invalid command if input other than those stated is used.
                while (!decisionSix.equalsIgnoreCase("try again")
                      && !decisionSix.equalsIgnoreCase("quit")) {
                    System.out.println(invalidCommand);
                    decisionSix = scan.nextLine();
                }
                if (decisionSix.equalsIgnoreCase("try again")) {
                  System.out.println();
                    continue JOURNEY;
                } else if (decisionSix.equalsIgnoreCase("quit")) {
                  System.out.println(quitGame);
                    break;
                  }
                }

              } else if (decisionThree.equalsIgnoreCase("Pasta")) {
                System.out.println();
                System.out.println("\tYou spend all your munch money and starve!");
                System.out.println(badGator);
                System.out.println();
                System.out.println(tryAgain);
                decisionSix = scan.nextLine();

              // used to print invalid command if input other than those stated is used.
              while (!decisionSix.equalsIgnoreCase("try again")
                    && !decisionSix.equalsIgnoreCase("quit")) {
                System.out.println(invalidCommand);
                decisionSix = scan.nextLine();
              }
              if (decisionSix.equalsIgnoreCase("try again")) {
                System.out.println();
                  continue JOURNEY;
              } else if (decisionSix.equalsIgnoreCase("quit")) {
                System.out.println(quitGame);
                  break;
              }
              }

            } else if (decisionTwo.equalsIgnoreCase("Brooks")) {
              System.out.println("\tRisky move, Gator. Do you want to "
                                + "go straight to 'Slice' or try the 'Main' Line?");
              System.out.println();
              decisionThree = scan.nextLine();

              // used to print invalid command if input other than those stated is used.
              while (!decisionThree.equalsIgnoreCase("Slice")
                    && !decisionThree.equalsIgnoreCase("Main")) {
                System.out.println(invalidCommand);
                decisionThree = scan.nextLine();
              }

              if (decisionThree.equalsIgnoreCase("Slice")) {
                System.out.println();
                System.out.println("\tThere is no cheese pizza today; "
                                  + "only leftovers from last week on a pizza!");
                System.out.println("\tA member of greek life took the "
                                  + "last cheese slice!");
                System.out.println("\tDo you want to 'fight' for it, "
                                  + "or 'leave' Brooks?");
                decisionFour = scan.nextLine();

                // used to print invalid command if input other than those stated is used.
                while (!decisionFour.equalsIgnoreCase("fight")
                      && !decisionFour.equalsIgnoreCase("leave")) {
                  System.out.println(invalidCommand);
                  decisionFour = scan.nextLine();
                }

                if (decisionFour.equalsIgnoreCase("fight")) {
                  System.out.println();
                  myFight.initiate_fight();

                  /** The constructor is called.
                    * Initiating the GreekFight, after it is complete the program
                    * uses a break and produces the final output.
                    */

                  break;


                } else if (decisionFour.equalsIgnoreCase("leave")) {
                  System.out.println();
                  System.out.println("\tYou decide to go back to your "
                                    + "dorm and make mac and cheese.");
                  System.out.println("\tNow you have practice for your "
                                    + "sports team, but a bunch \n\tof "
                                    + "friends are going out to a movie.");
                  System.out.println();
                  System.out.println("\tDo you go to 'practice' or 'call' "
                                    + "your coach saying you are sick?");
                  decisionFive = scan.nextLine();

                // used to print invalid command if input other than those stated is used.
                while (!decisionFive.equalsIgnoreCase("practice")
                      && !decisionFive.equalsIgnoreCase("call")) {
                  System.out.println(invalidCommand);
                  decisionFive = scan.nextLine();
                }

                if (decisionFive.equalsIgnoreCase("practice")) {
                  System.out.println();
                  System.out.println("\tWay to be a responsible and accountable teammate!");
                  System.out.println(congratsGator);
                  running = false;

                } else if (decisionFive.equalsIgnoreCase("call")) {
                  System.out.println("\tYou get benched from the next game and "
                                    + "crush your team's chemistry!");
                  System.out.println(badGator);
                  System.out.println();
                  System.out.println(tryAgain);
                  decisionSix = scan.nextLine();

                // used to print invalid command if input other than those stated is used.
                while (!decisionSix.equalsIgnoreCase("try again")
                      && !decisionSix.equalsIgnoreCase("quit")) {
                  System.out.println(invalidCommand);
                  decisionSix = scan.nextLine();
                }
                if (decisionSix.equalsIgnoreCase("try again")) {
                  System.out.println();
                  continue JOURNEY;
                } else if (decisionSix.equalsIgnoreCase("quit")) {
                  System.out.println(quitGame);
                    break;
                }
                }
                }

              } else if (decisionThree.equalsIgnoreCase("Main")) {
                System.out.println();
                System.out.println("\tThey are serving chicken for the 74th day in a row!");
                System.out.println("\tYou eat it anyways, and get food poisoning!");
                System.out.println(badGator);
                System.out.println();
                System.out.println(tryAgain);
                decisionSix = scan.nextLine();

              // used to print invalid command if input other than those stated is used.
              while (!decisionSix.equalsIgnoreCase("try again")
                    && !decisionSix.equalsIgnoreCase("quit")) {
                System.out.println(invalidCommand);
                decisionSix = scan.nextLine();
              }
              if (decisionSix.equalsIgnoreCase("try again")) {
                System.out.println();
                  continue JOURNEY;
              } else if (decisionSix.equalsIgnoreCase("quit")) {
                System.out.println(quitGame);
                  break;
                }
              }

            }

      /** If 'sleep' is selected then the program will produce the following output.
        * Then the user will be asked if they want to 'try again' if yes the program
        * will start at the continue at the Label, if no, the break will be iniatilized.
        */
      } else if (decisionOne.equalsIgnoreCase("sleep")) {
        System.out.println();
        System.out.println("\tYou sleep through the whole day, and fail out!");
        System.out.println(badGator);
        System.out.println();
        System.out.println(tryAgain);
        decisionSix = scan.nextLine();

        // used to print invalid command if input other than those stated is used.
        while (!decisionSix.equalsIgnoreCase("try again")
              && !decisionSix.equalsIgnoreCase("quit")) {
          System.out.println(invalidCommand);
          decisionSix = scan.nextLine();
        }
          if (decisionSix.equalsIgnoreCase("try again")) {
            System.out.println();
            continue JOURNEY;
          } else if (decisionSix.equalsIgnoreCase("quit")) {
              System.out.println(quitGame);
              break;
          }
      }
    }
  }
}
