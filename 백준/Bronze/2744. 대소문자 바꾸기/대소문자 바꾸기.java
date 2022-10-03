import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 예제 입력
        String str = br.readLine();
        br.close();

        /*
        소, 대문자 검사:
        1. 아스키 코드값을 기준으로 대, 소문자 구분
        2. 대, 소문자 변환은 (a - A = 32) 기준으로
           대문자면 +32 하여 소문자로 변환
           소문자면 -32 하여 대문자로 변환
        3. 변환된 문자는 StringBuilder에 이어 붙이기
        !주의할 점: charAt()을 통해 연산할 경우 int로 바뀌기 때문에 문자로 출력하기 위해서는 casting 필요
         */
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 97) {                      // 소문자 검사
                sb.append( (char) (str.charAt(i) - 32));    // 소문자면 대문자로 바꾸시오

            } else if (str.charAt(i) < 97) {                // 대문자 검사
                sb.append( (char) (str.charAt(i) + 32));    // 대문자면 소문자로 바꾸시오
            }
        }

        System.out.print(sb);

    }
}