import java.util.Scanner;
import java.util.Arrays;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index" + i + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("You entered = ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
