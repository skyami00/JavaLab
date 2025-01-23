import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println("Array = " + Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Summa = " + sum);

        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);

        int min = arr[0];
        int secondMin = arr[0];
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Second Min = " + secondMin);
        System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);

        second(args);
    }
    public static void second(String[] args) {
        String original = "Hello,,,  olleh    ";

        String noSpaces = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(noSpaces).reverse().toString();

        if (noSpaces.equals(reversed)) {
            System.out.println("\n\n" + original + " is palindrome.");}
        else {
            System.out.println("\n\n" + original + " is not palindrome.");

        }
    }
}




