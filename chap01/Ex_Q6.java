import java.util.Scanner;

public class Ex_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // i가 n 이하면 반복
            sum += i; // sum 에 i를 더함
            i++; // i값을 1만큼 증가시킴
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("변수 i의 값: " + i); // 변수 i의 값
    }
}
