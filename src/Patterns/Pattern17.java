package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // increasing
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A'+j));
            }

            // Decreasing
            for (int j = i-2; j >= 0; j--) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
