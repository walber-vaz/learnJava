package Conditions;

import java.util.Scanner;

public class StatementSwitch {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Esolha uma linguagem de programação: ");
    System.out.println("1 - Java");
    System.out.println("2 - Python");
    System.out.println("3 - JavaScript");
    System.out.println("4 - Go");

    int option = input.nextInt();
    System.out.println("Você escolheu a opção: " + option);

    switch (option) {
      case 1:
        System.out.println("Java é uma linguagem de programação orientada a objetos.");
        break;
      case 2:
        System.out.println("Python é uma linguagem de programação interpretada.");
        break;
      case 3:
        System.out.println("JavaScript é uma linguagem de programação interpretada.");
        break;
      case 4:
        System.out.println("Go é uma linguagem de programação compilada.");
        break;
      default:
        System.out.println("Opção inválida.");
    }

    input.close();
  }
}
