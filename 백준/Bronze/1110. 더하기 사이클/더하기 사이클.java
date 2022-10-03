import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;  // 싸이클 수
        int tmp = N;  // 초기값 저장 후, while 문 내에서 임시값 저장

        while (true) {

            tmp = (tmp % 10) * 10 + ((tmp/10 + tmp%10) % 10);
            cnt++;

            if (tmp == N) break;
        }

        System.out.print(cnt);

    }
}