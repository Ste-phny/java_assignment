import java.util.Arrays;
import java.util.Scanner;

public class Number3 {
   public static void main(String[] args) {
      int[] numbers = { 2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12 };
      Arrays.sort(numbers);
      int SumOfNumbers = 0 + 2 + 4 + 5 + 5 + 6 + 7 + 9 + 9 + 11 + 12;
      System.out.println(Arrays.toString(numbers));

      Scanner scanner = new Scanner(System.in);
      double Mean = SumOfNumbers / numbers.length;
      System.out.println("Mean = " + Mean);

      if (numbers.length % 2 == 0) {
         int mid1 = numbers[numbers.length / 2 - 1];
         int mid2 = numbers[numbers.length / 2];
         int Median = (mid1 + mid2) / 2;
         System.out.println("Median = " + Median);
      } else {
         if (numbers.length % 2 == 1)
            ;
         int Median = numbers[numbers.length / 2];
         System.out.println("Median =" + Median);
      }
      double sumSquaredDifferences = 0;
      for (int value : numbers) {
         double difference = value - Mean;
         sumSquaredDifferences += difference * difference;
      }
      double variance = sumSquaredDifferences / numbers.length;
      System.out.println("StandardDeviation = " + Math.sqrt(variance));
   }
}
