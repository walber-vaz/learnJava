package ObjectOrientation;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.name = "John";
    person.age = 30;
    person.birthday = LocalDate.of(1990, 1, 1);

    String displayAge = person.displayAge();
    int calculatedAge = person.calculateAge();

    System.out.println("Name: " + person.name);
    System.out.println(displayAge);
    System.out.println("Birthday: " + person.birthday + " (Calculated age: " + calculatedAge + ")");

    person.sayHello();
  }
}
