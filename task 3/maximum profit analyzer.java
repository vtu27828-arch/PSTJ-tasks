import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            currentSum += value;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}

Sample Input
8
-2 -3 4 -1 -2 1 5 -3
  Output
7
