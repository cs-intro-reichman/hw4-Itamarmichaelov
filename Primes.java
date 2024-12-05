public class Primes {
    public static void main(String[] args) {
        int members = Integer.parseInt(args[0]);
        boolean[] arr1 = new boolean[members + 1];
        int counter = 0;

        // Initialize all numbers as potentially prime
        for (int a = 2; a <= members; a++) {
            arr1[a] = true;
        }

        // Apply the Sieve of Eratosthenes logic
        for (int i = 2; i <= members; i++) {
            for (int j = i * 2; j <= members; j += i) {
                arr1[j] = false; // Mark multiples of i as non-prime
            }
        }

        // Print prime numbers and count them
        System.out.println("Prime numbers up to " + members + ":");
        for (int i = 2; i <= members; i++) {
            if (arr1[i]) {
                System.out.println(i);
                counter++;
            }
        }

        // Print the final count of primes
        System.out.println("There are " + counter + " primes between 2 and " + members + " (" + counter + "% are primes)");
    }
}
