import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double max = 0;
        double sum = 0;
        double[] score = new double[num];
        for (int i = 0; i < num; i++) {
            score[i] = Double.parseDouble(st.nextToken());

            if (score[i] > max) {
                max = score[i];
            }

            sum += score[i];

        }

        System.out.print( (sum/max*100) / num);

    }
}