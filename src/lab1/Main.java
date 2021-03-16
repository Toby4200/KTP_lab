package lab1;

public class Main {
    public static void main(String args[]) {
        Primes Prime = new Primes();
        Palindrome Pali = new Palindrome();
        String[] Palindroms = {"madam", "racecar", "apple", "kayak", "song", "noon"};


        // Проверяем массив слов на то являются ли слова полиндромами
        for (int i = 0; i < Palindroms.length; i++) {
            System.out.println(Pali.reverseString(Palindroms[i]));
            System.out.println(Pali.isPalindrome(Palindroms[i]));
        }


        for (int i = 2; i <= 100; i++) {
            if (Prime.isPrime(i)) {
                System.out.println(i);
            };
        }
    }
}


