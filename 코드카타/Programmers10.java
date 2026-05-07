public class Programmers10 {

    public double getAvg(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Programmers10 sol = new Programmers10();

        System.out.println(sol.getAvg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sol.getAvg(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99));
    }
}