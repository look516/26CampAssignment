import java.util.Arrays;

public class Programmers12 {
    public String solution(int[] arr) {
        double avg = Arrays.stream(arr).average().orElse(0);

        return avg % 1 == 0 ? String.valueOf((int)avg) : String.valueOf(avg);
    }

    public static void main(String[] args) {
        Programmers12 p = new Programmers12();
        System.out.println(p.solution(new int[]{1, 2, 3, 4})); // 2.5
        System.out.println(p.solution(new int[]{5, 5}));       // 5
    }
}