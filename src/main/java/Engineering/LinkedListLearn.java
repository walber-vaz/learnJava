package Engineering;

import java.util.LinkedList;

public class LinkedListLearn {

  public static void main(String[] args) {
    /*
     * LinkedList is a data structure that allows for the storage of elements in a
     * linear order. It is similar to an array, but it allows for more flexibility in
     * terms of adding and removing elements. LinkedLists are made up of nodes, where
     * each node contains a reference to the next node in the list.
     */
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");

    System.out.println("LinkedList: " + linkedList);
  }
}
