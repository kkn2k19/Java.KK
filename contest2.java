import java.util.Scanner;

public class contest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("#");
        // }
        // if ((i + j) % 2 != 0) {
        // System.out.print(".");
        // }
        // // System.out.println();
        // if ((i + j) % 2 == 0) {
        // System.out.print("#");
        // }
        // if ((i + j) % 2 != 0) {
        // System.out.print(".");
        // }
        // }
        // System.out.println();
        // for (int j = 1; j <= n; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("#");
        // }
        // if ((i + j) % 2 != 0) {
        // System.out.print(".");
        // }
        // // System.out.println();
        // if ((i + j) % 2 == 0) {
        // System.out.print("#");
        // }
        // if ((i + j) % 2 != 0) {
        // System.out.print(".");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }

                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }

                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}