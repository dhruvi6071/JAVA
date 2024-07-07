public class q1b {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Check if user provided the command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java PrimeNumbers <number>");
            System.exit(1);
        }

        // Parse the argument as integer
        int n = Integer.parseInt(args[0]);
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            System.exit(1);
        }

        // Display the first n prime numbers
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int num = 2; // Start checking numbers from 2 onwards

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
