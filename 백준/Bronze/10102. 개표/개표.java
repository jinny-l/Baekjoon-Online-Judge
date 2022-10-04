import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(br.readLine());
        String AB = br.readLine();

        /*
        투표 수 구하기:
        1. 문자열 잘라서 A랑 일치하면 A++ and vice versa
        2. A와 B 크기 비교 후 결과 출력
        */

        int A = 0;
        int B = 0;

        for (int i = 0; i < V; i++) {

            if ( AB.charAt(i) == 'A' ) A++;
            if ( AB.charAt(i) == 'B' ) B++;

        }

        System.out.print( A > B ? "A" : A < B ? "B" : "Tie" );
        
    }
}