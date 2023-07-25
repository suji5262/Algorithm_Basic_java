import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = 0; // 합
        for (int i = 0; i <= n; i++) {
            sum += i;
        } // sum 에 i를 더함

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
// 하나의 변수를 사용하는 반복문은 while 문보다 for 문을 사용하는 것이 좋음
