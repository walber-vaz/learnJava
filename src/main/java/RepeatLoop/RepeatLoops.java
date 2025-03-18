package RepeatLoop;

public class RepeatLoops {

  public static void main(String[] args) {
    /*
     * Repeat loops are used to execute a block of code multiple times.
     * WHILE LOOP -> It repeats a block of code as long as a condition is true.
     * FOR LOOP -> It repeats a block of code a specified number of times.
     **/

    // While
    int limitRepeat = 10;
    int counter = 0;

    while (counter <= limitRepeat) {
      counter++; // Increment the counter
      System.out.println("While loop: " + counter);
    }

    // For
    for (int i = 0; i <= limitRepeat; i++) {
      System.out.println("For loop: " + i);
    }
  }
}
