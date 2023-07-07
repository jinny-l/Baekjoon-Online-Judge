import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        long[] muscles = new long[N];
        for (int i = 0; i < N; i++) {
            muscles[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(muscles);

        // 풀이
        int lastIndex;
        boolean isEven = false;
        if (N % 2 == 0) {
            lastIndex = N - 1;
            isEven = true;
        } else {
            lastIndex = N - 2;
        }

        long max = 0;
        for (int i = 0; i < N / 2; i++) {
            long tmp = muscles[i] + muscles[lastIndex];
            max = Math.max(tmp, max);
            lastIndex--;
        }

        if (!isEven) {
            max = Math.max(max, muscles[N - 1]);
        }

        System.out.println(max);
    }
}
