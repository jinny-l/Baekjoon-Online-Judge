import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] wUniv = readScores(br);
        int[] kUniv = readScores(br);
        Arrays.sort(wUniv);
        Arrays.sort(kUniv);
        System.out.println(calculateScores(wUniv) + " " + calculateScores(kUniv));
    }

    public static int[] readScores(BufferedReader br) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        return scores;
    }

    public static int calculateScores(int[] sorted) {
        int sum = 0;
        for (int i = sorted.length - 1; i > sorted.length - 4; i--) {
            sum += sorted[i];
        }
        return sum;
    }
}
