import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many odd numbers to print: ");
        int a = sc.nextInt();
        sc.close();
        if (a <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;
            if (i > 1) sb.append(", ");
            sb.append(odd);
        }
        System.out.println("First " + a + " odd numbers: " + sb);
    }
}
