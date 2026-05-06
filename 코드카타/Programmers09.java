public class Programmers09 {

    public int getEven(int n) {
        int answer = 0;

        // 주의: 0도 짝수다.
        // 따라서, 1이 입력되면 0이 반환되어야 한다.
        if (n > 1000 || n <= 0) {
            return -1;
        }

        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers09 sol = new Programmers09();

        System.out.println(sol.getEven(10));
        System.out.println(sol.getEven(4));
        System.out.println(sol.getEven(1));
    }
}