package Engineering;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLearn {

  public static void main(String[] args) {
    /*
     * HashSet is a collection that implements the Set interface.
     * It is part of the Java Collections Framework.
     * */
    List<String> list = new ArrayList<>();

    list.add("A");
    list.add("A");
    list.add("B");
    list.add("C");

    System.out.println("List: " + list);

    Set<String> set = new HashSet<>(list);

    System.out.println("Set: " + set);
  }
}
