import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int cmp = N;    // 원래 값 저장
        int cnt = 0;    // 싸이클 수

        while (true) {

            int N1 = ((N / 10 + N % 10)) % 10; // 1의 자리수
            int N10 = N % 10 * 10; // 10의 자리수
            N = N1 + N10;  // 새로운 수
            cnt++;

            if (N == cmp) {
                break;
            }
        }

        System.out.println(cnt);

    }
}