package problem3;

public class Descending {
    public static void main(String[] args) {
        for (int i = 1000; i >= 1; i--) {
            if ((i % 5) == 0) {
                System.out.println();
            }
            System.out.print(i+"\t");
        }
    }
}
