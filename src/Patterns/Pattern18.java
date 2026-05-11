package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // starting character
            char ch = (char) ('A' + (n - i));

            // print characters
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
