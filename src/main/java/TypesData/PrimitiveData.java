package TypesData;

public class PrimitiveData {
    public static void main(String[] args) {
        /*
        * Type of Primitive Data
        *
        * 1. byte
        * 2. short
        * 3. int
        * 4. long
        * 5. float
        * 6. double
        * 7. char
        * 8. boolean
        *
        * */

        int age = 32;
        double height = 1.75;
        char initialLetter = 'A';
        boolean isDeadOrAlive = true;
        Long bankBalance = 100_000_000L;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial Letter: " + initialLetter);
        System.out.println("Is Dead or Alive: " + isDeadOrAlive);
        System.out.println("Bank Balance: " + bankBalance);
    }
}
