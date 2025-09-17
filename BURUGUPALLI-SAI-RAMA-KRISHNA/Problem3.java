import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a; 

        for (int i = 1; i <= limit; i++) {
            System.out.print((2 * i - 1));
            if (i < limit) {
                System.out.print(", ");
            }
        }
    }
}
