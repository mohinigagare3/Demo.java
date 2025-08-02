public class FirstFiftyPrime {

    public static void main(String[] args) {
        int count = 0; // To keep track of how many prime numbers found
        int num = 2;   // Start checking from the first prime number

        System.out.println("First 50 Prime Numbers:");

        while (count < 50) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        // Check for divisibility from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not prime if divisible by any number in this range
            }
        }
        return true; // Prime if no divisors found
    }
}