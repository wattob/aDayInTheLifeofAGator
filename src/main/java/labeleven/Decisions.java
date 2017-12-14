package labeleven;

/** The public class has a method that stores the input from the user.
 * An object oriented list is produced when the correct path has been completed.
 * The results are then printed in the terminal.
 */

public class Decisions {

  /** When the correct path is selected, the choices the user makes will appear.
   * An object oriented list is used to created to save the decisions and put them
   * in list form to be printed in the terminal window.The decisions are kept as
   * strings. Decision 6 was used to determine if the user restarts the program
   * so it has been left out of the list.
   */

  String decision1;
  String decision2;
  String decision3;
  String decision4;
  String decision5;
  String decision7;

  void addDecisions(String d1, String d2, String d3, String d4, String d5, String d7) {
    decision1 = d1;
    decision2 = d2;
    decision3 = d3;
    decision4 = d4;
    decision5 = d5;
    decision7 = d7;
  }

  void printDecisions() {
    System.out.println(decision1);
    System.out.println(decision2);
    System.out.println(decision3);
    System.out.println(decision4);
    System.out.println(decision5);
    System.out.println(decision7);
  }

}
