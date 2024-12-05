public class Primes {
    public static void main(String[] args) {
        // Reading the upper limit for prime numbers
        int members = Integer.parseInt(args[0]);
        boolean[] arr1 = new boolean[members + 1];
        int counter = 0;

        // Initialize all values as true (potential primes)
        for (int a = 2; a <= members; a++) {
            arr1[a] = true;
        }

        // Sieve of Eratosthenes to mark non-prime numbers
        for (int i = 2; i <= members; i++) {
            if (arr1[i]) {
                for (int j = i * 2; j <= members; j += i) {
                    arr1[j] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers up to " + members + ":");
        for (int i = 2; i <= members; i++) {
            if (arr1[i]) {
                System.out.println(i);
                counter++;
            }
        }

        // Calculate the percentage of primes
        double percentage = (counter / (double) (members - 1)) * 100;
        
        // Print the final count and percentage
        System.out.println("There are " + counter + " primes between 2 and " + members + 
                           " (" + (int) percentage + "% are primes)");
    }
}
