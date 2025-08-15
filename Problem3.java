import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int a = sc.nextInt();
        sc.close();
        int terms = (a % 2 == 1) ? a : Math.max(0, a - 1);
        if (terms <= 0) {
            System.out.println("No odd numbers to display.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= terms; i++) {
            int odd = 2 * i - 1;
            if (i > 1) sb.append(", ");
            sb.append(odd);
        }
        System.out.println("Odd numbers up to " + a + ": " + sb);
    }
}
