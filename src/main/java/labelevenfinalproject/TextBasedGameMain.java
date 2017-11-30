package labeleven;

import java.util.Scanner;

public class TextBasedGameMain {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Welcome to Interactive Storytelling:");
    System.out.println();
    System.out.println("A Day in the Life of a Gator!");

    System.out.println("You wake up to the buzz of you alarm. \n Do you keep sleeping or get out of bed?");

    Go = scan.next();

if(Go.equalsIgnoreCase("")) {
  System.out.println();
}


  }
}
