package Praktikum11;

import java.util.Scanner;

public class Square07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah *: ");
        int n = sc.nextInt();

        
        for (int i = 1; i<= n; i++ ) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        System.out.println();
    }
  }
}
