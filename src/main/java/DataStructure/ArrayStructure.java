package DataStructure;

import java.util.Arrays;

public class ArrayStructure {

  public static void main(String[] args) {
    // Declare an array
    String [] names = new String[5];

    // Assign values to the array
    names[0] = "Foo";
    names[1] = "Bar";
    names[2] = "Baz";
    names[3] = "Qux";
    names[4] = "Quux";

    System.out.println(Arrays.toString(names));

    // Print the array
    for (String s : names) {
      System.out.println(s);
    }

    // Quando faz rescrita de um array, ele não cria um novo array, ele apaga os valores antigos
  }
}
