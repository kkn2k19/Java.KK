// 13.04.2024
// HCF of two Numbers 

import java.util.Scanner;

public class HCF_of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF = " + hcf(a, b));
    }

    static int hcf(int a, int b) {
        int hcf = 1;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}

/*
 * Output --
 * 
 * Provide two Numbers : 30 100
 * HCF = 10
 */