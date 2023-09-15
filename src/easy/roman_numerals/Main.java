package easy.roman_numerals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution solution = new Solution();
        int n = solution.romanToInt(str);
        System.out.println(n);
    }
}
