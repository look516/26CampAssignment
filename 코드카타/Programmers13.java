public class Programmers13 {

    public int Programmers13(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Programmers13 p = new Programmers13();
        System.out.println(p.Programmers13(123));
    }
}