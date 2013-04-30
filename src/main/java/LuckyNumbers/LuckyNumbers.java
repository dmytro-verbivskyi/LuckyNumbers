package LuckyNumbers;

/**
 * Lucky Numbers on the tickets
 */
public class LuckyNumbers {
    public static void main(String[] args) {
        int allDigits = 6;
        int halfOfDigits = allDigits / 2;
        int combinations[][] = new int[halfOfDigits * 9][2];

        int MAX = 999; //getMaxForAmount(halfOfDigits);
        for (int i = 0; i < MAX; i++) {
            int firstPartSum = sumOfDigits(i);

            int a = 9;
        }

        System.out.println("Hello World!");
    }

    static int sumOfDigits(int number) {
        int sum = 0;

        for ( ; number != 0; ) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    static int getMaxForAmount(int amount) {
        int result = 0;

        for (int i = 0; i < amount; i++) {
            result += 9 * i;
        }
        /*
        +9
        +90
        +900
         */
        return 0;
    }
}
