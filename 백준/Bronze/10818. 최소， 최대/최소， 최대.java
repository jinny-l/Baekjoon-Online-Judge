import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000001;
        int min = 1000001;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        
        System.out.println(min + " " + max);

    }
}