import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        String[] ox = new String[num];

        for (int i = 0; i < num; i++) {
            ox[i] = br.readLine();
        }


        for (int i = 0; i < num; i++) {

            int cnt = 0;
            int score = 0;

            for (int j = 0; j < ox[i].length(); j++) {

                if (ox[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                score += cnt;
            }
            sb.append(score).append('\n');
        }
        System.out.print(sb);
    }
}