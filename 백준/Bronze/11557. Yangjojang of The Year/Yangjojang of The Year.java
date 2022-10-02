import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // T, N 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        /*      [테스트 케이스 입력]
                 1. 배열 2개 생성하여, 하나는 대학교 하나는 술의 양 저장
                 2. 배열 입력받을 때마다, 대학교의 max 술 소비량 및 해당 인덱스 저장
         */
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] univ = new String[N];
            int[] alcohol = new int[N];
            int max = 0;
            int index = 0;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                univ[j] = st.nextToken();
                alcohol[j] = Integer.parseInt(st.nextToken());

                if (alcohol[j] > max) {
                    max = alcohol[j];
                    index = j;
                }
            }
            System.out.println(univ[index]);
        }

    }
}
