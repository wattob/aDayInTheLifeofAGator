import java.util.Random;
import java.util.Scanner;

  // public class InteractiveGame {
  //   public InteractiveGame(){
  //
  //   }
  //
  //     //public static void main(String[] args) {
  //     public void run_greek_life(){
  //       //implement counter for how many you beat
  //
  //       // hp go past 100 oh no
  //       //system objects
  //       Scanner scan = new Scanner(System.in);
  //       Random rand = new Random();
  //
  //
  //       //
  //       String[] enemies = {"Theta Chi", "Phi Psi", "Fiji", "Phi Delt"};
  //       int maxEnemyHealth = 75;
  //       int enemyDamage = 25;
  //
  //       //
  //       int health = 100;
  //       int attackDmg = 50;
  //       int numPowerade = 3;
  //       int healAmount = 30;
  //       int healthPotionDropChance = 50;
  //
  //
  //       System.out.println("Welcome to Greek Life!");
  //
  //       //label
  //       GAME:
  //       while (true) {
  //         System.out.println("--------------------------------------");
  //
  //         int enemyHealth = rand.nextInt(maxEnemyHealth);
  //         // picks a random number from string on line 15
  //
  //         String enemy = enemies[rand.nextInt(enemies.length)];
  //         System.out.println("\t# " + enemy + " has appeared! #\n");
  //
  //
  //
  //         while (enemyHealth > 0) {
  //           System.out.println("\tYour HP: " + health);
  //           System.out.println("\n\tWhat would you like to do?");
  //           System.out.println("\t1. Attack");
  //           System.out.println("\t2. Drink Powerade");
  //           System.out.println("\t3. Run");
  //
  //           String input = scan.nextLine();
  //           if (input.equals("1")){
  //             int damageDealt = rand.nextInt(attackDmg);
  //             int damageTaken = rand.nextInt(enemyDamage);
  //
  //             enemyHealth -= damageDealt;
  //             health -= damageTaken;
  //
  //             System.out.println("\t You punch the " + enemy + " for " + damageDealt + " damage");
  //             System.out.println("\t You recieved " + damageTaken + " in retaliation");
  //
  //             if (health < 1) {
  //                   System.out.println("\t You have taken too much damage, you are too weak to go on");
  //
  //                   break;
  //             }
  //           } else if (input.equals("2")) {
  //
  //             if (numPowerade > 0) {
  //                   health += healAmount;
  //                   numPowerade--;
  //                   System.out.println("\t You Drank a health potion that healed for: " + healAmount + "."
  //                                           + "\n\t You now have " + health + "HP."
  //                                           + "\n\t You now have " + numPowerade + " health potions left.\n");
  //             } else {
  //                   System.out.println("\t You have no health potions, defeat enemies for a chance to get one.");
  //             }
  //           } else if (input.equals("3")) {
  //               System.out.println("\t You run away from the " + enemy);
  //               continue GAME;
  //           } else {
  //               System.out.println("\tinvalid Command");
  //           }
  //         }
  //         if (health < 1) {
  //               System.out.println("You limp out of the fight, weakened.");
  //               break;
  //         }
  //         System.out.println("--------------------------------------");
  //         System.out.println(" # " + enemy + " was defeated! # ");
  //         System.out.println(" # You have " + health + "HP left #");
  //
  //         if (rand.nextInt(100) < healthPotionDropChance) {
  //               numHealthPots++;
  //               System.out.println(" # The " + enemy + " dropped a health potion. # ");
  //               System.out.println(" # You now have " + numPowerade + " health potion(s). # ");
  //         }
  //         System.out.println("--------------------------------------");
  //         System.out.println(" What would you like to do now?");
  //         System.out.println("1. Continue Fighting");
  //         System.out.println("2. Exit dunegeon");
  //         String input = scan.nextLine();
  //        }
  //         while (!input.equals("1") && !input.equals("2")) {
  //             System.out.println("invalid command");
  //             input = scan.nextLine();
  //
  //         }
  //         if (input.equals("1")) {
  //               System.out.println("You continue your battle.");
  //         } else if (input.equals("2")) {
  //               System.out.println("You leave Brooks.");
  //               break;
  //         }
  //       }
  //       System.out.println("--------------------------------------");
  //       System.out.println("Thanks For playing!");
  //       System.out.println("--------------------------------------");
  //     }
  // }







  //String name = "Bad Gator";
  //examine feature

  //while (true) {
  //System.out.println();
  //System.out.println("You go to your first class of the day, and need to decide where to eat. \nDo you want to eat at 'Brooks' or 'Kins'?");
  //if else (.equalsIgnoreCase("examine"))
  //System.out.println("Theres stuff man")

  //erranonous inputs feature and response
  //  A Day In the Life of a Gator!

  // You wake up to the buzzing of your alarm.
  //Do you go back to 'sleep' or 'get up' out of bed?
  //snooze
  //wattob@aldenv138:~/cs111F2017/computer-science-111-fall-2017-lab-11-group-74$ get up
  //No command 'get' found, but there are 18 similar ones
  //get: command not found

  // add more decisions using different logic/an array (like todoList).

//String name;
  //System.out.println("Please enter your age.");
 //age = scan.nextInt();

 //if (age>13) {

     //This stores the name of the player to the variable nm.
     //System.out.println("Hello. Please Enter your Name :");
     //}else {
         //System.out.println("You are not old enough.");
         //System.exit(0);
     //}

 //name=scan.next(); /*allows the user to enter a name, if he/she is older than 17, and younger than 23.*/
