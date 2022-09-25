import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int A, B;
        A = Integer.parseInt(str.nextToken());
        B = Integer.parseInt(str.nextToken());

        System.out.print(A + B);
    }
}
