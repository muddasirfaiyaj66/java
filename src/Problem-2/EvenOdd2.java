import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        int T;
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= T; i++) {
            String number = scanner.nextLine();

            char lastDigit = number.charAt(number.length() - 1);

            if (lastDigit == '0' || lastDigit == '2' || lastDigit == '4' || lastDigit == '6' || lastDigit == '8') {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        scanner.close();
    }
}
