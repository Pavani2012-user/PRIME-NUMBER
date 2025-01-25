public class Prime{
    public static void main(String[] args) {
        int number = 29; // You can change this number to test other values

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If num is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors were found, num is prime
    }
}



