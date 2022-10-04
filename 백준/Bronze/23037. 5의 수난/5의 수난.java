import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String n = br.readLine();
        
        /* 
        각 자릿수의 다섯 제곱의 합 구하기:
        1. for 문 - 스트링 길이 만큼 반복
        2. 각 자리수를 짤라 정수형으로 변환
        3. 5제곱 수 합산    
         */
        int sum = 0;
        for (int i = 0; i < n.length(); i++) { 
            int val = Character.getNumericValue(n.charAt(i));
            sum += Math.pow(val, 5);
        }

       System.out.print(sum);

    }
}