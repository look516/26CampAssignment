public class Programmers07 {
    public int parseInteger(int num1, int num2) {
        double answer = 0;
        answer = (double) num1 / num2;
        answer = answer * 1000;
        return (int) answer;
    }


    public static void main(String[] args) {
        Programmers07 division = new Programmers07();

        System.out.println(division.parseInteger(3, 2));
        System.out.println(division.parseInteger(7, 3));
        System.out.println(division.parseInteger(1, 16));
    }
}