import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] arr;

        StringTokenizer str;

        for (int i = 0; i < testCase; i++) {
            int num;            // 학생 수
            double sum = 0;     // 성적 합
            double average = 0; // 성적 평균
            double cnt = 0;     // 평균 넘는 학생 수

            str = new StringTokenizer(br.readLine(), " ");

            num = Integer.parseInt(str.nextToken());
            arr = new int[num];
            
            // 배열 저장 및 성적 합 구하기
            for (int j = 0; j < num; j++) {
                arr[j] = Integer.parseInt(str.nextToken());
                sum += arr[j];
            }
            
            // 평균
            average = sum / num;
            
            // 평균 값 넘는 학생 수 구하기
            for (int j = 0; j < num; j++) {
                if (arr[j] > average) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt / num) * 100);

        }
    }
}