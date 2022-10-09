import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int arr[] = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        int result = 0;  // 홀수 합
        int min = 100;     // 홀수 중 최소 값

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) { // 배열에서 홀수 찾아내기
                result += arr[i];

                if (arr[i] < min) min = arr[i]; // 홀수 중에 최소 값 찾기
            }
        }

        // 출력
        if (result == 0) { // 홀수가 존재하지 않는 경우
            System.out.print(-1);

        } else {
            System.out.println(result);
            System.out.print(min);
        }

    }
}