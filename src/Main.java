public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;  // Add 5 to a without repeating the variable

        a -= 4;  // Subtract 4 from a without repeating the variable

        int b = a;  // Assign the value of a to int b
        b++;  // Increment b by one without using a or int b = b + 1

        boolean statement1 = b % 2 != 0;  // Check if b is an odd number
        boolean statement2 = (b * (b + 1)) % 3 == 0;  // Check if (b * (b + 1)) is a multiple of 3

        if (statement1 && statement2) {
            System.out.println("Both statements are true.");
        } else {
            System.out.println("At least one statement is false.");
    }
  }
}
