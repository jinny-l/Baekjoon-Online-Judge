import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 개수 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 리스트와 배열에 포켓몬 이름 및 인덱스 저장
        Map<String, Integer> map = new HashMap<>(); // 포켓몬 이름, 인덱스 저장
        String[] pokemons = new String[n]; // 포켓몬 이름만 저장

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            map.put(name, i + 1);
            pokemons[i] = name;
        }

        // 답안 탐색
        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            try {
                int number = Integer.parseInt(input);
                sb.append(pokemons[number - 1]).append("\n");
            } catch (NumberFormatException e) {
                sb.append(map.get(input)).append("\n");
            }
        }
        System.out.print(sb);
    }

}
