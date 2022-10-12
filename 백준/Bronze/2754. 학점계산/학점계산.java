import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] score = new String[] {
                "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"
        };

        double[] scoreNum = new double[] {
                4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0
        };

        String cLang = br.readLine();

        for (int i = 0; i < 13; i++) {
            if (cLang.equals(score[i])) {
                System.out.print(scoreNum[i]);
            }
        }
        
    }
}