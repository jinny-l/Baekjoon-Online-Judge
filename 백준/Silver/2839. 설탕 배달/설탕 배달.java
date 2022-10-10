import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0; // 봉투 개수

        if (N == 4 || N == 7) {
            cnt = -1;

        } else if ( (N % 5) == 0 ) { // 5의 배수일 때
            cnt = N / 5;

        } else if ( (N % 5) == 1 || (N % 5) == 3 ) {  // 5의 배수 +1 or +3일 때
            cnt = (N / 5) + 1;

        } else if ( (N % 5) == 2 || (N % 5) == 4 ) {  // 5의 배수 +2 or +4일 때
            cnt = (N / 5) + 2;
        }

        System.out.print(cnt);

    }
}