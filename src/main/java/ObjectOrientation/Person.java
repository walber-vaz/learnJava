package ObjectOrientation;

import java.time.LocalDate;

public class Person {
  String name;
  int age;
  LocalDate birthday;

  public void sayHello() {
    System.out.println("Hello, my name is " + name);
  }

  public String displayAge() {
    return "I am " + age + " years old";
  }

  public int calculateAge() {
    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();
    int birthYear = birthday.getYear();
    return currentYear - birthYear;
  }
}
