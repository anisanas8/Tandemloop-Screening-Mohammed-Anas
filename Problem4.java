import java.util.*;
public class Problem4 {
    private static int[] parseInputLine(String line) {
        String normalized = line.trim().replace(",", " ").replaceAll("\\s+", " ");
        if (normalized.isEmpty()) return new int[0];
        String[] parts = normalized.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (space or comma separated):");
        String line = sc.hasNextLine() ? sc.nextLine() : "";
        sc.close();
        int[] arr = parseInputLine(line);
        if (arr.length == 0) {
            System.out.println("No numbers entered.");
            return;
        }
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int k = 1; k <= 9; k++) counts.put(k, 0);
        for (int x : arr) {
            for (int k = 1; k <= 9; k++) {
                if (x % k == 0) counts.put(k, counts.get(k) + 1);
            }
        }
        System.out.println("Divisibility counts (k: count):");
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (int k = 1; k <= 9; k++) {
            if (!first) sb.append(", ");
            first = false;
            sb.append(k).append(": ").append(counts.get(k));
        }
        sb.append("}");
        System.out.println(sb);
    }
}
