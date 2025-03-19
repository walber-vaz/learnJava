package DataStructure;

public class Array2d {

  public static void main(String[] args) {
    /*
    * Array 2D -> 2 Dimensional Array
    *
    * Arra 2sd represents a table of rows and columns
    *
    * | 1 | 2 | 3 |
    * | 4 | 5 | 6 |
    * | 7 | 8 | 9 |
    * */

    // Declaration
    String[][] names = new String[3][3];

    // Initialization
    names[0][0] = "John";
    names[0][1] = "Doe";
    names[0][2] = "Smith";
    names[1][0] = "Jane";
    names[1][1] = "Doe";
    names[1][2] = "Smith";
    names[2][0] = "Alex";
    names[2][1] = "Doe";
    names[2][2] = "Smith";

    // Accessing
    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names[i].length; j++) {
        System.out.print(names[i][j] + " ");
      }
      System.out.println();
    }
  }
}
