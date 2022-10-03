import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            String[] abc = scanner.nextLine().split(" ");
            int A = Integer.parseInt(abc[0]);
            int B = Integer.parseInt(abc[1]);
            int C = Integer.parseInt(abc[2]);
            int max = Math.max( (C-B), (B-A)) - 1;
            System.out.println(max);
        }
        scanner.close();
    }
}