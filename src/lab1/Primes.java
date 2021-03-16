package lab1;

public class Primes {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false; // Число не простое так делится нацело на другое число
            }
        }

        return true; // число простое так делится только на себя и единицу
    }
}