import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // N, K 입력
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // x 입력
        int[] x = new int[N];

        // 배열에 값 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(x);

        //출력
        System.out.print(x[N-k]);

    }
}