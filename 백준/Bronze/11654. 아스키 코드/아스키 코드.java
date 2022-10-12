import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String c = br.readLine();

        System.out.print(c.charAt(0) * 1);
    }
}