package Conditions;

public class IfElse {
    public static void main(String[] args) {
        /*
        * If Else Statement and Else If Statement
        *
        * The if-else statement is used to execute both the true block and false block based on the condition.
        * */
        String name = "Walber";
        String rank;
        int age = 32;
        boolean flag = false;
        short number = 10;

        if (age >= 18 && number >= 10) {
            rank = "A";
            System.out.println("Rank is " + rank);
        } else if (age >= 18 && number < 10) {
            rank = "B";
            System.out.println("Rank is " + rank);
        } else {
            rank = "C";
            System.out.println("Rank is " + rank);
        }

        if (name.equals("Walber")) {
            System.out.println("Name is Walber");
        } else {
            System.out.println("Name is not Walber");
        }

        if (age > 18) {
            System.out.println("Age is greater than 18");
        } else {
            System.out.println("Age is less than 18");
        }

        if (flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }

        if (number == 10) {
            System.out.println("Number is 10");
        } else {
            System.out.println("Number is not 10");
        }
    }
}
