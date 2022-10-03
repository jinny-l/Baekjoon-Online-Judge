import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 예제 입력
        String str = br.readLine();
        String result = "";   // 대,소문자 뒤집은 결과 값 저장할 변수
        br.close();

        // 대, 소문자 검사
        for (int i = 0; i < str.length(); i++) {
            char tmp;
            if (str.charAt(i) >= 97) {              // 대문자 검사
                tmp = (char) (str.charAt(i) - 32);  // 대문자 > 소문자로 변환
                result += tmp;                      // 변수에 결과 이어붙이기

            } else if (str.charAt(i) < 97) {        // 소문자 검사
                tmp = (char) (str.charAt(i) + 32);  // 소문자 > 대문자로 변환
                result += tmp;                      // 변수에 결과 이어붙이기
            }
        }

        System.out.print(result);

    }
}