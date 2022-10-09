import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        BigInteger A = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        br.close();

        if (operator.equals("*")) { // 연산자가 *이면 곱하고
            System.out.print(A.multiply(B));
        } else if (operator.equals("+")) {  // +면 더하라
            System.out.print(A.add(B));
        }

    }
}