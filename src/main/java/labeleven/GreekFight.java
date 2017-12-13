// import java.util.Scanner;
// import java.util.Random;
//
// /** the source code.
// *
// *
// *
// *
// */
//
// public class GreekFight {
//
//   //public myFight() {
// 
//
//
//       /** the source code.
//      *
//      *
//      *
//      *
//      */
//      public void initiate_fight(){
//
//        /** the source code.
//       *
//       *
//       *
//       *
//       */
//
//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//
//        /** the source code.
//         *
//         *
//         *
//         *
//         */
//
//        String[] enemies = {"Theta Chi", "Phi Psi", "Fiji", "Phi Delt"};
//        int maxEnemyHealth = 75;
//        int enemyDamage = 25;
//
//        int health = 100;
//        int attackDmg = 50;
//        int numPowerade = 1;
//        int healAmount = 50;
//        int poweradeChance = 40; // percentage
//
//        System.out.println("Welcome to Greek Life!");
//      //decisions
//
//        FIGHT:
//        while (true) {
//          System.out.println();
//
//          int enemyHealth = rand.nextInt(maxEnemyHealth);
//          // picks a random number from string on line 15
//          String enemy = enemies[rand.nextInt(enemies.length)];
//          System.out.println("\t# " + enemy + " has appeared! #\n");
//
//      //how to call a method from another class file in java
//
//          while (enemyHealth > 0) {
//            System.out.println("\tYour HP: " + health);
//            System.out.println("\n\tWhat would you like to do?");
//            System.out.println("\t1. 'Attack'");
//            System.out.println("\t2. 'Drink' Powerade.");
//            System.out.println("\t3. Run");
//
//            String input = scan.nextLine();
//            if (input.equalsIgnoreCase("Attack")){
//              int damageDealt = rand.nextInt(attackDmg);
//              int damageTaken = rand.nextInt(enemyDamage);
//
//              enemyHealth -= damageDealt;
//              health -= damageTaken;
//
//              System.out.println("\t You punch the " + enemy + " for " + damageDealt + " damage");
//              System.out.println("\t You recieved " + damageTaken + " in return");
//
//              if (health < 1) {
//                    System.out.println("\t You have taken too much damage, you are too weak to go on");
//
//                    break;
//              }
//            } else if (input.equalsIgnoreCase("Drink")) {
//
//              if (numPowerade > 0) {
//                    health += healAmount;
//                    numPowerade--;
//                    System.out.println("\t You drank Powerade that healed for: " + healAmount + "."
//                                            + "\n\t You now have " + health + "HP."
//                                            + "\n\t You now have " + numPowerade + " bottle(s) of Powerade left.\n");
//              } else {
//                    System.out.println("\t You have no Powerade, defeat the " + enemy + " for a chance to get some.");
//              }
//            } else if (input.equalsIgnoreCase("run")) {
//                System.out.println("\t You run away from the " + enemy);
//                continue FIGHT;
//            } else {
//                System.out.println("\tinvalid Command");
//            }
//          }
//          if (health < 1) {
//                System.out.println("You limp out of the party, weak from battle.");
//                break;
//          }
//          System.out.println();
//          System.out.println(" # " + enemy + " was defeated! # ");
//          System.out.println(" # You have " + health + "HP left #");
//
//          if (rand.nextInt(100) < poweradeChance) {
//                numPowerade++;
//                System.out.println(" # The " + enemy + " dropped Powerade. # ");
//                System.out.println(" # You now have " + numPowerade + " bottle(s) of Powerade. # ");
//          }
//          System.out.println();
//          System.out.println(" What would you like to do now?");
//          System.out.println("'Continue' Fighting");
//          System.out.println(" 'Exit' Brooks");
//          String input = scan.nextLine();
//
//          while (!input.equalsIgnoreCase("Continue") && !input.equalsIgnoreCase("Exit")) {
//              System.out.println("invalid command");
//              input = scan.nextLine();
//
//          }
//          if (input.equals("Continue")) {
//                System.out.println("You continue your fights.");
//          } else if (input.equals("Exit")) {
//            //create objects java
//                System.out.println("You leave Brooks.");
//                break;
//          }
//        }
//      }
//
//   }
