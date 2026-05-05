public class Programmers08 {
    // 예각: 0 초과 90 미만
    // 직각: 90
    // 둔각: 90 초과 180 미만
    // 평각: 180
    // 각의 범위(int): 0 - 360

    public int getAngle(int angle) {
        // 정수만 들어온다고 가정했을 때
        if (angle <= 0 || angle >= 360) {
            return -1;
        }

        if (angle > 180) {
            angle = 360 - angle;
        }

        if (angle < 90) {
            return 1;
        }

        if (angle == 90) {
            return 2;
        }

        if (angle < 180) {
            return 3;
        }

        // if (angle == 180) 작성하고 나머지는 예외처리해도 됨
        return 4;
    }

    public static void main(String[] args) {
        Programmers08 sol = new Programmers08();

        System.out.println(sol.getAngle(70));
        System.out.println(sol.getAngle(91));
        System.out.println(sol.getAngle(180));
    }
}