public class Programmers14 {
    public int programmers14(int n) {
        int answer = 1;


        for (int i = 2; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        if (n == 0) return 0;
        return answer;
    }

    public static void main(String[] args) {
        Programmers14 p = new Programmers14();

        System.out.println(p.programmers14(1));
        System.out.println(p.programmers14(0));
        System.out.println(p.programmers14(7));
        System.out.println(p.programmers14(2));
        System.out.println(p.programmers14(3000));
        System.out.println(p.programmers14(1000));
    }
}