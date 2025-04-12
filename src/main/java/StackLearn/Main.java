package StackLearn;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Stack<String> namesStack = new Stack<>();

    namesStack.push("Jhon");
    namesStack.push("James");
    namesStack.push("John");

    System.out.printf("Names stack: %s".formatted(namesStack));
    namesStack.pop();

    System.out.printf("Names stack: %s%n", namesStack.peek());
    System.out.printf("Lenght stack: %s%n", namesStack.size());
  }
}
