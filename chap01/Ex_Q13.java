import java.util.Scanner;

public class Ex_Q13 {

    /**
     * 한 변으로 하는 정사각형을 *로 출력하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("정사각형을 출력합니다.");

        do {
            System.out.print("변의 길이: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
