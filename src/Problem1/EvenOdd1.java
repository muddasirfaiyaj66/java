package Problem1;

import java.util.Scanner;

public class EvenOdd1 {

    public static void main(String[] args) {
        int T, i, n;
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();

        for (i = 1; i <= T; i++) {

            n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        scanner.close();


    }

}
