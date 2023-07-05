import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int N = Integer.parseInt(br.readLine());

        int[] ropes = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        Arrays.sort(ropes);
        int max = 0;

        for (int i = 0; i < N; i++) {
            int weight = ropes[i] * (N - i);
            max = Math.max(weight, max);
        }
        
        System.out.println(max);
    }
}
