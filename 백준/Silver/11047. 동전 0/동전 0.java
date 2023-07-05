import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] > money) {
                continue;
            }

            cnt += money / coins[i];
            money = money % coins[i];
        }
        System.out.println(cnt);
    }
}
