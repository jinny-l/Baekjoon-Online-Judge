import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        br.close();

        /*
        [감독관 수 구하기]
        !주의: 총감독관(B)은 시험장에 무조건 1명이기 때문에 시험장 응수자(A)에서 B를 빼주고 출력할 때 더해주기
        1. 시험장당 필요한 부감독 수 = (시험장 인원 - B) / C
        2. 단 1번 계산식에서 나머지가 있을 수 있기 때문에 나머지 값이 있을 경우 부감도 수를 하나 더해 줘야함
         */

        long cnt = N;

        for (int i = 0; i < N; i++) {
            int supv = 0;
            A[i] = A[i] - B;

            if (A[i] <= 0) continue;
            else if (A[i] > 0) {
                supv = A[i] / C;
            }

            if ( (A[i] % C) != 0 ) {
                supv++;
            }

            cnt += supv;

        }

        System.out.print(cnt);

    }
}