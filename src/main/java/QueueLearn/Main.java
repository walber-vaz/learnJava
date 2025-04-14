package QueueLearn;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    Queue queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);

    System.out.println(queue); // Output: [1, 2, 3]

    // Remove an element from the queue
    int removedElement = (int) queue.remove();
    System.out.println("Removed element: " + removedElement); // Output: Removed element: 1

    // Peek at the front element of the queue
    int frontElement = (int) queue.peek();
    System.out.println("Front element: " + frontElement); // Output: Front element: 2

    // Check if the queue is empty
    boolean isEmpty = queue.isEmpty();
    System.out.println("Is the queue empty? " + isEmpty); // Output: Is the queue empty? false
  }
}
