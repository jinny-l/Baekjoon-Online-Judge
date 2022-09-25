import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] piece = new int[] {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < piece.length; i++){
            int num;
            num = Integer.parseInt(str.nextToken());
            sb.append(piece[i] - num).append(" ");
        }
        System.out.println(sb);
    }
}
