import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 배열 입력
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        list.sort(Collections.reverseOrder());
        System.out.println(list.get(n - 1));
    }

}
