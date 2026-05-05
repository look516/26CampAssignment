public class Programmers04 {
    public int birthYear(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        Programmers04 sol = new Programmers04();

        System.out.println(sol.birthYear(40));
        System.out.println(sol.birthYear(23));
    }
}