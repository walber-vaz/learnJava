package ObjectOrientation;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.name = "John";
    person.age = 30;
    person.birthday = LocalDate.of(1990, 1, 1);

    System.out.println("Name: " + person.name);
    System.out.println("Age: " + person.age);
    System.out.println("Birthday: " + person.birthday);
  }
}
