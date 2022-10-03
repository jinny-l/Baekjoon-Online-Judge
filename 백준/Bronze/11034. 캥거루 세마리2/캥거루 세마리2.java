import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ( (str = br.readLine()) != null) {      // EOF 처리
            st = new StringTokenizer(str, " ");

            // ABC 값 입력받기
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            sb.append( (Math.max((C - B), (B - A)) - 1) ).append("\n");

        }
        System.out.print(sb);
    }
}