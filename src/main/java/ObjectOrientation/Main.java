package ObjectOrientation;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
//    Person person = new Person();
//    person.name = "John";
//    person.age = 30;
//    person.birthday = LocalDate.of(1990, 1, 1);
//
//    Role admin = new Role();
//    admin.name = "Jane";
//    admin.age = 25;
//    admin.birthday = LocalDate.of(1995, 1, 1);
//    admin.nameRole = "Admin";
//
//    person.sayHello();
//    System.out.println(person.displayAge());
//    System.out.println(person.calculateAge());
//
//    admin.sayHello();
//    System.out.println(admin.displayAge());
//    System.out.println(admin.calculateAge());
//    admin.sayRole();
    Customer customer = new Customer();
    customer.name = "John";
    customer.age = 30;
    customer.birthday = LocalDate.of(1990, 1, 1);
    customer.nameRole = "Customer";

    customer.myRole();
  }
}
