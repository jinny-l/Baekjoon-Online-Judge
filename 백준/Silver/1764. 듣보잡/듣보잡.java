import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // N, M 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N 명단 입력
        Set<String> setN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            setN.add(br.readLine());
        }

        // M 명단 입력
        Set<String> setM = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            setM.add(br.readLine());
        }

        // 교집합 구하기
        List<String> setMN = new ArrayList<>(setN);
        setMN.retainAll(setM);

        // 정렬
        Collections.sort(setMN);

        // 결과 출력
        System.out.println(setMN.size());

        Iterator<String> iterator = setMN.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append("\n");
        }

        System.out.println(sb);
    }
}
