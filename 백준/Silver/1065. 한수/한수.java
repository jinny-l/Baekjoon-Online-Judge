import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count;

        if (N < 100) {
            System.out.println(N);
            return;
        } else {
            count = 99;
        }

        for (int i = 100; i <= N; i++) {
            int hundred = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            if ((hundred - ten) == (ten - one)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
