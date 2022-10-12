import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 예제 입력
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());

        br.close();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}