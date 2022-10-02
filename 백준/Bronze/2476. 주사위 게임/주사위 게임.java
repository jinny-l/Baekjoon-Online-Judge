import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int maxReward = 0;
        for (int i = 0; i < N; i++) {
            // 상금, 같은 눈 개수, 비교값 초기화
            int reward = 0;
            int max = 0;

            // 주사위 눈 입력
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            // 최대값 찾기
            max = Math.max(Math.max(num1, num2), num3);

            // 주사위 같은 눈 세면서 상금 저장
            if (num1 == num2 && num1 == num3) reward = 10000 + num1*1000;
            else if (num1 == num2 || num1 == num3) reward = 1000 + num1*100;
            else if (num2 == num3) reward = 1000 + num2*100;
            else reward = max*100;

            if (reward > maxReward) maxReward = reward;

        }

        System.out.print(maxReward);

    }
}
