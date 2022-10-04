import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // 배열 입력
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열 정렬
        Arrays.sort(arr);

        //출력
        for (int val : arr) {
            sb.append(val).append('\n');
        }

        System.out.print(sb);

    }
}