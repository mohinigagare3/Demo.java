public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } 
        // Recursive case: n * factorial of (n-1)
        else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // The number for which to calculate the factorial

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }
}