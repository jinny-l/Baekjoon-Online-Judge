import java.io.*;
import java.util.*;

public class Main {

    public static long alpha(long A, long B) {
        return (A + B) * (A - B);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long result = alpha(A, B);

        System.out.print(result);

    }
}