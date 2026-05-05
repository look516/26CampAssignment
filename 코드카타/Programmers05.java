class Programmers05 {
    public int equal(int num1, int num2) {
        int answer = -1;
        if (num1 == num2) {
            answer = 1;
        }
        return answer;
    }

    public int compare(int num1, int num2) {
        int answer = Integer.compare(num1, num2);
        return answer;
    }

    public static void main(String[] args) {
        Programmers05 sol = new Programmers05();
        System.out.println(sol.equal(2, 3));
        System.out.println(sol.equal(11, 11));
        System.out.println(sol.equal(7, 99));

        System.out.println(sol.compare(2, 3));
        System.out.println(sol.compare(11, 11)); // compare method는 같은 값일 때 0을 반환
        System.out.println(sol.compare(7, 99));
    }
}