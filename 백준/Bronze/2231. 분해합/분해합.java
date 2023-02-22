import java.util.Scanner;

/**
 * [문제 풀이 방법]
 * 1. 10부터 N까지 분해합 구하기(10부터 도는 이유는 일의 자리수는 분해합이 없다고 생각했기 때문)
 * 2. 분해합이 N과 같다면 해당 값 출력(작은 수부터 돌았기 때문에 복수의 생성자가 있다고 해도 해당 값이 최소값이 됨)
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;

            // 분해합 구하기
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // 분해합과 N이 같은지 비교
            if ((sum + i) == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
