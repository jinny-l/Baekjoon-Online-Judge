import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        String title[] = new String[N];
        int dfclt[] = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            title[i] = st.nextToken();
            dfclt[i] = Integer.parseInt(st.nextToken());
        }

        /*
        제일 쉬운 문제 찾기:
        1. 정수 배열에서 min 값 찾기
        2. min 값의 인덱스 저장
        3. 해당 인덱스에 해당하는 스트링 배열값 출력
         */

        int index = 0;
        int min = 4;

        for (int i = 0; i < N; i++) {

            if (dfclt[i] < min) {
                min = dfclt[i];
                index = i;
            }
        }

        System.out.print(title[index]);

    }
}