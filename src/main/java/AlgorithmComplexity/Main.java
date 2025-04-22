package AlgorithmComplexity;

import java.util.ArrayList;


public class Main {

  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", 30));
    employees.add(new Employee("Bob", 25));
    employees.add(new Employee("Charlie", 35));

    // o(1) - Constant time complexity
    System.out.println("O(1) -> Employee: " + employees.get(0).getName() + ", Age: " + employees.get(0).getAge());

    System.out.println("-------------------------------------");
    // o(n) - Linear time complexity
    for (Employee employee : employees) {
      System.out.println("O(n) -> Employee: " + employee.getName() + ", Age: " + employee.getAge());
    }

    System.out.println("-------------------------------------");
    // o(n^2) - Quadratic time complexity
    for (int i = 0; i < employees.size(); i++) {
      for (int j = 0; j < employees.size(); j++) {
        System.out.println("O(n^2) -> Employee: " + employees.get(i).getName() + ", Age: " + employees.get(j).getAge());
      }
    }
  }
}
