public class Programmers04 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        Programmers04 sol = new Programmers04();

        System.out.println(sol.solution(40));
        System.out.println(sol.solution(23));
    }
}