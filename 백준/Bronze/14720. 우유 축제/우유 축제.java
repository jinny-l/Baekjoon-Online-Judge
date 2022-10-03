import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // 우유 가게 정보 입력 - 배열
        int milk[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            milk[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        /*
        마실 수 있는 우유 개수 체크:
        1. 맨 처음에는 0만 마실 수 있음
        2. 0을 마신 후에는 1만 마실 수 있음
        3. 1을 마신 후에는 2만 마실 수 있음
        4. 2를 마신 후에는 0만 마실 수 있음
         */
        int max = 0;
        int cmp = 0;
        for (int i = 0; i < N; i++) {

            if (milk[i] == cmp) {
                cmp++;
                max++;
            }

            if (cmp == 3) cmp = 0;

        }
        System.out.print(max);
    }
}
