public class Recursion{

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; //factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 9;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}