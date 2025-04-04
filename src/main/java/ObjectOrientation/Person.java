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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}
