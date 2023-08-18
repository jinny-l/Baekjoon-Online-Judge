import java.time.*;
import java.util.*;
import java.time.format.TextStyle;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        String day = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return day;
    }
}