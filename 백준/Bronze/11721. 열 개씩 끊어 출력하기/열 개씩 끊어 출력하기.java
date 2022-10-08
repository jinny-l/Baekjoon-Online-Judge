import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        br.close();

        // 10개씩 끊기
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (i % 10 == 9) {
                sb.append('\n');
            }
        }
        
        // 출력
        System.out.print(sb);

    }
}