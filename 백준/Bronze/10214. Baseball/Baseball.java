import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // T 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int arr1[] = new int[9];
        int arr2[] = new int[9];
        
        // 점수 입력
        for (int i = 0; i < T; i++) {
            int Yonsei = 0;
            int Korea = 0;
            for (int j = 0; j < 9; j++) { // 9개의 값 입력과 동시에, 합산 값 저장
                st = new StringTokenizer(br.readLine(), " ");
                arr1[j] = Integer.parseInt(st.nextToken());
                arr2[j] = Integer.parseInt(st.nextToken());
                Yonsei += arr1[j];
                Korea += arr2[j];
            }
            if (Yonsei > Korea) System.out.println("Yonsei");
            if (Yonsei < Korea) System.out.println("Korea");
            if (Yonsei == Korea) System.out.println("Draw");
        }
    }
}
