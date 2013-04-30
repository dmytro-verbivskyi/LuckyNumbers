package LuckyNumbers;

/**
 * Lucky Numbers on the tickets
 */
public class LuckyNumbers {
    public static void main(String[] args) {
        int allDigits = 6;
        int halfOfDigits = allDigits / 2;
        int combinations[][] = new int[halfOfDigits * 9][2];

        int MAX = 99; //getMaxForAmount(halfOfDigits);
        for (int i = 1; i < MAX; i++) {
            int firstPartSum = sumOfDigits(i);

            System.out.println("i: " + i + "; sum: " + firstPartSum);

            int secondPartVariants = 0;

            if (combinations[firstPartSum][0] != 0) {
                System.out.println("   already know for : " + firstPartSum + "; combinations: " + combinations[firstPartSum][0]);
                System.out.println("   total was : " + combinations[firstPartSum][1] + "; and will be: " + (combinations[firstPartSum][1] + secondPartVariants));
                secondPartVariants = combinations[firstPartSum][0];
                combinations[firstPartSum][1] += secondPartVariants;
            } else {
                System.out.println("   first calc for : " + firstPartSum );
                for (int j = 1; (firstPartSum * j) <= MAX; j++) {
                    secondPartVariants++;
                    System.out.println("   j: " + j + "; firstPartSum * j: " + (firstPartSum * j) + "; secondPartVariants: " + secondPartVariants);
                }
                combinations[firstPartSum][0] = secondPartVariants;
                combinations[firstPartSum][1] = secondPartVariants;
            }
            int a = 0;

        }


    }

    static int sumOfDigits(int number) {
        int sum = 0;

        for (; number != 0; ) {
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
