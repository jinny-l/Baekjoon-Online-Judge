import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 문자열 길이 입력 (for문에서 써도 되고 안써도 됨)
        String num = br.readLine(); // 문자열 입력
        
        /*
        1. 문자열 > 정수형으로 변환
        2. 변환과 동시에 더한 값을 sum에 저장
         */
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.print(sum);
    }
}