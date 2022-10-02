import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.print(today);

    }
}
