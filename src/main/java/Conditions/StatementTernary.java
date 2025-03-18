package Conditions;

public class StatementTernary {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int result;

    result = (a > b) ? a : b;
    System.out.println("Result usage ternary = " + result);

    if (a > b) {
      result = a;
    } else {
      result = b;
    }
    System.out.println("Result usage if = " + result);
  }
}
