package gem_supply;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        int [][] Array = new int[n][2];
        for (int j = 0; j < Arr.length; j++) {
            for (int k = 0; k < 2; k++) {
                Array [j][k] = sc.nextInt();
            }
        }
        sc.close();

        Solution solution = new Solution();
        int ans = solution.giveGem(Arr, Array);
        System.out.println(ans);
    }
}
