import java.util.Scanner;

public class Solution {
    /**
     * Calculate fibonacci of n.
     * @param n throw
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * For testing.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println(result);

    }
}
