import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // color 값 저장
        Map<String, Integer> colors = new HashMap<>() {
            {
                put("black", 0);
                put("brown", 1);
                put("red", 2);
                put("orange", 3);
                put("yellow", 4);
                put("green", 5);
                put("blue", 6);
                put("violet", 7);
                put("grey", 8);
                put("white", 9);
            }
        };

        // 입력
        String color1 = bufferedReader.readLine();
        String color2 = bufferedReader.readLine();
        String color3 = bufferedReader.readLine();

        long result = (colors.get(color1) * 10 + colors.get(color2)) * (long) Math.pow(10, colors.get(color3));

        // 결과 출력
        System.out.println(result);
    }
}
