import java.util.Scanner;

public class Ex_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        int n = sc.nextInt();
        int sum = (n+1) * (n/2) + (n%2 == 1 ? (n+1)/2 : 0); // 가우스 덧셈 공식 사용
        // 만약 정수의 개수가 홀수라면? → "남은 1개의 홀수를 더한다"

        System.out.println("1에서 " + n + "까지의 총합은" + sum + "입니다.");
    }
}
