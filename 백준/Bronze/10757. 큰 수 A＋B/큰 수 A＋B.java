import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        BigInteger A = new BigInteger(str.nextToken());
        BigInteger B = new BigInteger(str.nextToken());

        System.out.println(A.add(B));
    }
}
