package easy.isPalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution solution = new Solution();
        boolean a = solution.isPalindrome(x);
        System.out.println(a);
    }
}
