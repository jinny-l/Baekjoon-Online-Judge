import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // 문자열 입력 및 중복 제거
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // HashSet -> String 배열로 전환
        String[] arr = set.toArray(set.toArray(new String[0]));

        // 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);  // 사전 순서로 정렬
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        // 출력
        for (String str : arr) {
            sb.append(str).append("\n");
        }

        System.out.print(sb);

    }
}