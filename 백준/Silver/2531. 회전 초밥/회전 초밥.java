import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력
        int dishAmount = Integer.parseInt(st.nextToken());
        int type = Integer.parseInt(st.nextToken());
        int continuousDish = Integer.parseInt(st.nextToken());
        int couponDish = Integer.parseInt(st.nextToken());

        List<Integer> sushi = new ArrayList<>();
        for (int i = 0; i < dishAmount; i++) {
            sushi.add(Integer.parseInt(br.readLine()));
        }
        sushi.addAll(sushi.subList(0, continuousDish - 1));

        int max = 0;
        for (int i = 0; i < dishAmount; i++) {
            Set<Integer> temp = new HashSet<>(sushi.subList(i, i + continuousDish));
            if (temp.size() + 1 > max && !temp.contains(couponDish)) {
                max = temp.size() + 1;
            }
            if (temp.size() > max && temp.contains(couponDish)) {
                max = temp.size();
            }
        }
        // 출력
        System.out.println(max);
    }
}
