public class Programmers11 {
    public String Programmers11(int num) {
            String answer = "Odd";
            if (num % 2 == 0) {
                answer = "Even";
            }
            return answer;
    }

    public static void main(String[] args) {
        Programmers11 p = new Programmers11();

        System.out.println(p.Programmers11(4));
        System.out.println(p.Programmers11(5));
        System.out.println(p.Programmers11(0));
    }
}
