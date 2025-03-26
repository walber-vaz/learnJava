package ObjectOrientation;

import java.time.LocalDate;

public abstract class Person {
  protected String name;
  protected int age;
  protected LocalDate birthday;

  public void sayHello() {
    System.out.println("Hello, my name is " + name);
  }

  public abstract String displayAge();

  public abstract int calculateAge();
}
