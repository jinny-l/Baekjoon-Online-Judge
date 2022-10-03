import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T 입력
        int T = Integer.parseInt(br.readLine());

        // 테스트 케이스 입력
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            // 테이스 케이스 출력
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}
