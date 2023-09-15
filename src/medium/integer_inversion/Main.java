package medium.integer_inversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Solution solution = new Solution();
        System.out.println(solution.reverse(n));
    }
}
