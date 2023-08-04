import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("값: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print("+"); // 짝수
            else
                System.out.print("-"); // 홀수
        }

/*        for (int i = 1; i <= n; i++) { // i 값을 1부터 증가 하려면!
            if (i % 2 == 0)
                System.out.print("-"); // 짝수
            else
                System.out.print("+"); // 홀수
        } // 4곳을 변경해야 함(유연하지 x)  */

    }
}
