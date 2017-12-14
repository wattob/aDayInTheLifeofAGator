package labeleven;

import java.util.Random;
import java.util.Scanner;

/** This class has a method that will take the user through a fight with a
 * member of greek. A constructor and object are created and called in
 * InteractiveGameMain.
 */

public class GreekFight {

  /** The source code inside will be executed when the program is run.
  * The output will be produced in the terminal window.
  * The program is run when only when the user picks the 'Fight' option in Brooks.
  */
  public void initiate_fight() {

    /** When the program is run a random enemy will be selected. Than the user
      * decides how to Continue, if they attack then they will recieve and give
      * a random int. If they use powerade, than their health will increase by the
      * int healAmount. A label is used to continue playing the program. When the
      * end is reached it starts from the label and only stops when the user exits
      * which iniatilizes a break.
      */

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    /** A scanner and random method are created.
     * The scanner reads in the input from the user, while the random method
     * selects random ints for that will be used when the program is run.
     * The variables are declared below.
     */

    String[] enemies = {"Theta Chi", "Phi Psi", "Fiji", "Phi Delt"};
    int maxEnemyHealth = 75;
    int enemyDamage = 25;
    int health = 100;
    int attackDmg = 50;
    int numPowerade = 1;
    int healAmount = 50;
    int poweradeChance = 25;

    FIGHT:
      while (true) {
        System.out.println();

        // picks a random amount of health for the enemy with the minimum 1
        int enemyHealth = rand.nextInt(maxEnemyHealth) + 1;

        // picks a random number from string on line 44
        String enemy = enemies[rand.nextInt(enemies.length)];
        System.out.println("\tA " + enemy + " has appeared! \n");

        while (enemyHealth > 0) {
          System.out.println("\tYour HP: " + health);
          System.out.println("\tWhat would you like to do?");
          System.out.println("\t'Attack'");
          System.out.println("\t'Drink' Powerade.");
          System.out.println("\t'Run'");

          String input = scan.nextLine();
          if (input.equalsIgnoreCase("Attack")) {
            int damageDealt = rand.nextInt(attackDmg);
            int damageTaken = rand.nextInt(enemyDamage);

            enemyHealth -= damageDealt;
            health -= damageTaken;

            System.out.println("\tYou punch the " + enemy + " for " + damageDealt + " damage");
            System.out.println("\tYou recieved " + damageTaken + " in return");
            if (health < 1) {
              System.out.println("\t You have taken too much damage, you are too weak to go on");
                break;
            }
          } else if (input.equalsIgnoreCase("Drink")) {

            if (numPowerade > 0) {
              health += healAmount;
              numPowerade--;
                System.out.println("\tYou drank Powerade that healed for: " + healAmount + "."
                                           + "\n\t You now have " + health + "HP."
                                           + "\n\t You now have " + numPowerade
                                           + " bottle(s) of Powerade left.\n");
            } else {
              System.out.println("\tYou have no Powerade, defeat the " + enemy
                                          + " for a chance to get some.");
            }
          } else if (input.equalsIgnoreCase("run")) {
            System.out.println("\tYou run away from the " + enemy);
            break;
          } else {
            System.out.println("\tINVALID COMMAND. Enter one of the two options listed above.");
          }
        }
        if (health < 1) {
            System.out.println("\tYou leave, weak from the fight.");
            break;
        }
        if (enemyHealth < 1) {
          System.out.println();
          System.out.println("\tThe " + enemy + " was defeated! ");
          System.out.println("\tYou have " + health + "HP left ");
        }
        if (rand.nextInt(100) < poweradeChance) {
            numPowerade++;
            System.out.println("\tThe " + enemy + " dropped Powerade. ");
            System.out.println("\tYou now have " + numPowerade + " bottle(s) of Powerade. ");
        }
        System.out.println();
        System.out.println("\tWhat would you like to do now?");
        System.out.println("\t'Continue' Fighting");
        System.out.println("\t'Exit' Brooks");
        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("Continue") && !input.equalsIgnoreCase("Exit")) {
            System.out.println("\tINVALID COMMAND. Enter one of the two options listed above.");
            input = scan.nextLine();

        }
        if (input.equalsIgnoreCase("Continue")) {
            System.out.println("\tYou continue your fight with another greek member.");
        } else if (input.equalsIgnoreCase("Exit")) {

            System.out.println("\tYou leave Brooks.");
            System.out.println("\tOn your way out, President Mullen takes you to his office "
                                        + "\n\tand suspends you for the semester!");
            System.out.println("\tBad Gator!");
            break;
        }
      }
  }
}
