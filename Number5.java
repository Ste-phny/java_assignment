import java.util.Scanner;
import java.util.Arrays;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                System.out.print("index[" + i + "][" + y + "] : ");
                numbers[i][y] = scanner.nextInt();
            }
        }
        System.out.println("You entered: ");
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + "   ");
            }
            System.out.println();
        }
    }
}
