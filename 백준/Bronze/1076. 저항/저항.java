import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        Map<String, List<String>> colors = new TreeMap<>(){
            {
                put("black", List.of("0", ""));
                put("brown", List.of("1", "0"));
                put("red",  List.of("2", "00"));
                put("orange", List.of("3", "000"));
                put("yellow", List.of("4", "0000"));
                put("green", List.of("5", "00000"));
                put("blue", List.of("6", "000000"));
                put("violet", List.of("7", "0000000"));
                put("grey", List.of("8", "00000000"));
                put("white", List.of("9", "000000000"));
            }
        };

        for (int i = 0; i < 2; i++) {
            String color = bufferedReader.readLine();
            stringBuilder.append(colors.entrySet().stream()
                    .filter(e -> e.getKey().equals(color))
                    .map(Map.Entry::getValue)
                    .findFirst()
                    .get()
                    .get(0));
        }

        String color = bufferedReader.readLine();
        stringBuilder.append(colors.entrySet().stream()
                .filter(e -> e.getKey().equals(color))
                .map(Map.Entry::getValue)
                .findFirst()
                .get()
                .get(1));

        System.out.println(Long.parseLong(stringBuilder.toString()));
    }
}
