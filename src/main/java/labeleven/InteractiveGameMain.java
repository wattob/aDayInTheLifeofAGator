package labeleven;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;


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
    String c = "Congratulations! You made it through a day in the life of a Gator!";
    String i = "INVALID COMMAND. Enter one of the two options listed above.";
    //String Examine;

    System.out.println("Dillon Thoma and Ben Watto " + new Date());
    System.out.println("Welcome to Interactive Storytelling:");
    System.out.println();
    System.out.println("A Day In the Life of a Gator!");
    System.out.println();

    int age;
    System.out.println("Please enter your age.");
    age = scan.nextInt();

    if (age >= 17 && age <= 23) {

      System.out.println();
      System.out.println("Welcome fellow Gator! Let's begin our journey!");
    } else {
        System.out.println("What are you doing at a college? You're not the right age! \nOh well, let's begin our journey!");

      }
      Decision1 = scan.nextLine();

    System.out.println();
    System.out.println("You wake up to the buzzing of your alarm. \nDo you go back to 'sleep' or 'get up' out of bed?");
    Decision1 = scan.nextLine();

    while (!Decision1.equalsIgnoreCase("sleep") && !Decision1.equalsIgnoreCase("get up")) {
      System.out.println(i);
      Decision1 = scan.nextLine();
    }

      if (Decision1.equalsIgnoreCase("get up")) {
        //while (true) {
          System.out.println();
          System.out.println("You go to your first class of the day, and need to decide where to eat for lunch. \nDo you want to eat at 'Brooks' or 'Kins'?");
        //if else (.equalsIgnoreCase("examine"))
        //System.out.println("Theres stuff man")
          Decision2 = scan.nextLine();

          while (!Decision2.equalsIgnoreCase("Brooks") && !Decision2.equalsIgnoreCase("Kins")) {
            System.out.println(i);
            Decision2 = scan.nextLine();
          }

          if (Decision2.equalsIgnoreCase("Kins")) {
              System.out.println();
              System.out.println("Good choice. \nWhat do you want to eat? 'Cantina' or 'Pasta'?");
              Decision3 = scan.nextLine();

              while (!Decision3.equalsIgnoreCase("Cantina") && !Decision3.equalsIgnoreCase("Pasta")) {
                System.out.println(i);
                Decision3 = scan.nextLine();
              }

              if (Decision3.equalsIgnoreCase("Cantina")) {
                  System.out.println();
                  System.out.println("You enjoy your lunch and head to your afternoon classes. \nAfter class, do you want to do 'homework' or take a 'nap'?");
                  Decision4 = scan.nextLine();

                  while (!Decision4.equalsIgnoreCase("homework") && !Decision4.equalsIgnoreCase("nap")) {
                    System.out.println(i);
                    Decision4 = scan.nextLine();
                  }

                  if (Decision4.equalsIgnoreCase("homework")) {
                      System.out.println();
                      System.out.println("Way to be a responsible Gator! \nIt's almost dinner time! Do you want 'Chipotle' or 'Taco Bell'?");
                      Decision5 = scan.nextLine();

                      while (!Decision5.equalsIgnoreCase("Chipotle") && !Decision5.equalsIgnoreCase("Taco Bell")) {
                        System.out.println(i);
                        Decision5 = scan.nextLine();
                      }

                      if (Decision5.equalsIgnoreCase("Taco Bell")) {
                          System.out.println();
                          System.out.println("$12 for 12 tacos? Best investment of your life! \nWay to be a financially responsible Gator!");

                        } else if (Decision5.equalsIgnoreCase("Chipotle")) {
                            System.out.println();
                            System.out.println("The nearest Chipotle is in Erie, and you get a flat tire on the way!");
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

                      while (!Decision3.equalsIgnoreCase("Slice") && !Decision3.equalsIgnoreCase("Main")) {
                        System.out.println(i);
                        Decision3 = scan.nextLine();
                      }

                      if (Decision3.equalsIgnoreCase("Slice")) {
                        System.out.println();
                        System.out.println("There is no cheese pizza today; only leftovers from last week on a pizza!");
                        System.out.println("A member of greek life took the last cheese slice!");
                        System.out.println("Do you want to 'fight' for it, or 'leave' Brooks?");
                        Decision4 = scan.nextLine();

                        while (!Decision4.equalsIgnoreCase("fight") && !Decision4.equalsIgnoreCase("leave")) {
                          System.out.println(i);
                          Decision4 = scan.nextLine();
                        }

                        if (Decision4.equalsIgnoreCase("fight")) {
                          System.out.println();
                          //public static void GreekFight() {
                          //GreekFight = scan.nextLine();


                        } else if (Decision4.equalsIgnoreCase("leave")) {
                        System.out.println();
                        System.out.println("You decide to go back to your dorm and make mac and cheese.");
                        System.out.println("Now you have practice for your sports team, but a bunch \nof friends are going out to a movie.");
                        System.out.println();
                        System.out.println("Do you go to 'practice' or 'call' your coach saying you are sick?");
                        Decision5 = scan.nextLine();

                        while (!Decision5.equalsIgnoreCase("practice") && !Decision5.equalsIgnoreCase("call")) {
                          System.out.println(i);
                          Decision5 = scan.nextLine();
                        }

                        if (Decision5.equalsIgnoreCase("practice")) {
                          System.out.println();
                          System.out.println("Way to be a responsible and accountable teammate!");
                          System.out.println(c);

                        } else if (Decision5.equalsIgnoreCase("call")) {
                          System.out.println("You get benched from the next game and crush your team's chemistry!");
                          System.out.println(a);
                        }
                      }

                    } else if (Decision3.equalsIgnoreCase("Main")) {
                      System.out.println();
                      System.out.println("They are serving chicken for the 74th day in a row!");
                      System.out.println("You eat it anyways, and get food poisoning!");
                      System.out.println(a);
                  }

                } else if (Decision1.equalsIgnoreCase("sleep")) {
                  System.out.println();
                  System.out.println("You sleep through the whole day, and fail out!");
                  System.out.println(a);
                }
              }
              //
              // private static void GreekFight(){
              //   //implement counter for how many you beat
              //
              //   // hp go past 100 oh no
              //   //system objects
              //   Scanner scan = new Scanner(System.in);
              //   Random rand = new Random();
              //
              //
              //   //
              //   String[] enemies = {"Theta Chi", "Phi Psi", "Fiji", "Phi Delt"};
              //   int maxEnemyHealth = 75;
              //   int enemyDamage = 25;
              //
              //   //
              //   int health = 100;
              //   int attackDmg = 50;
              //   int numPowerade = 3;
              //   int healAmount = 30;
              //   int healthPotionDropChance = 50;
              //
              //
              //   System.out.println("Welcome to Greek Life!");
              //
              //   //label
              //   GAME:
              //   while (true) {
              //     System.out.println("--------------------------------------");
              //
              //     int enemyHealth = rand.nextInt(maxEnemyHealth);
              //     // picks a random number from string on line 15
              //
              //     String enemy = enemies[rand.nextInt(enemies.length)];
              //     System.out.println("\t# " + enemy + " has appeared! #\n");
              //
              //
              //
              //     while (enemyHealth > 0) {
              //       System.out.println("\tYour HP: " + health);
              //       System.out.println("\n\tWhat would you like to do?");
              //       System.out.println("\t1. Attack");
              //       System.out.println("\t2. Drink Powerade");
              //       System.out.println("\t3. Run");
              //
              //       String input = scan.nextLine();
              //       if (input.equals("1")){
              //         int damageDealt = rand.nextInt(attackDmg);
              //         int damageTaken = rand.nextInt(enemyDamage);
              //
              //         enemyHealth -= damageDealt;
              //         health -= damageTaken;
              //
              //         System.out.println("\t You punch the " + enemy + " for " + damageDealt + " damage");
              //         System.out.println("\t You recieved " + damageTaken + " in retaliation");
              //
              //         if (health < 1) {
              //               System.out.println("\t You have taken too much damage, you are too weak to go on");
              //
              //               break;
              //         }
              //       } else if (input.equals("2")) {
              //
              //         if (numPowerade > 0) {
              //               health += healAmount;
              //               numPowerade--;
              //               System.out.println("\t You Drank a health potion that healed for: " + healAmount + "."
              //                                       + "\n\t You now have " + health + "HP."
              //                                       + "\n\t You now have " + numPowerade + " health potions left.\n");
              //         } else {
              //               System.out.println("\t You have no health potions, defeat enemies for a chance to get one.");
              //         }
              //       } else if (input.equals("3")) {
              //           System.out.println("\t You run away from the " + enemy);
              //           continue GAME;
              //       } else {
              //           System.out.println("\tinvalid Command");
              //       }
              //     }
              //     if (health < 1) {
              //           System.out.println("You limp out of the fight, weakened.");
              //           break;
              //     }
              //     System.out.println("--------------------------------------");
              //     System.out.println(" # " + enemy + " was defeated! # ");
              //     System.out.println(" # You have " + health + "HP left #");
              //
              //     if (rand.nextInt(100) < healthPotionDropChance) {
              //           numPowerade++;
              //           System.out.println(" # The " + enemy + " dropped a health potion. # ");
              //           System.out.println(" # You now have " + numPowerade + " health potion(s). # ");
              //     }
              //     System.out.println("--------------------------------------");
              //     System.out.println(" What would you like to do now?");
              //     System.out.println("1. Continue Fighting");
              //     System.out.println("2. Exit dunegeon");
              //     String input = scan.nextLine();
              //
              //     while (!input.equals("1") && !input.equals("2")) {
              //         System.out.println("invalid command");
              //         input = scan.nextLine();
              //
              //     }
              //     if (input.equals("1")) {
              //           System.out.println("You continue your battle.");
              //     } else if (input.equals("2")) {
              //           System.out.println("You leave Brooks.");
              //           break;
              //     }
              //   }
              //   System.out.println("--------------------------------------");
              //   System.out.println("Thanks For playing!");
              //   System.out.println("--------------------------------------");
              }
            }
