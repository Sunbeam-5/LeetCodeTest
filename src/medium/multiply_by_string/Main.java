package medium.multiply_by_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        Solution solution = new Solution();
        String num3 = solution.multiply(num1, num2);
        System.out.println(num3);
    }
}
