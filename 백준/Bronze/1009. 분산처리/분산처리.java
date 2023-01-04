import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        // T 입력
        int T = Integer.parseInt(bufferedReader.readLine());

        /*
         * [a, b 입력 및 데이터가 처리되는 컴퓨터 번호 계산]
         * 컴퓨터 번호 계산(입력 값이 double 범위를 넘어가기 때문에 Math.pow()를 사용 X
         * 제곱 수가 10이 넘을 때마다 10으로 나눈 나머지(= 일의 자리수) 구하기
         */
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int result = 1;
            
            // 컴퓨터 번호 계산
            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }
            
            if (result == 0) { // 나머지가 0인 경우, 10으로 치환
                result = 10;
            }
            stringBuilder.append(result).append("\n");
        }

        // 결과 출력
        System.out.println(stringBuilder);
    }
}
