import java.util.Scanner;

public class Ex_Q10 {
    public static void main(String[] args) {
        /**
         * 양의 정수를 입력하고 자릿수를 출력하는 프로그램
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수값 자리수를 구합니다.");

        int a;
        do {
            System.out.printf("정수 값 : ");
            a = sc.nextInt();
        } while (a <= 0);

        int b = 0;
        while ( a > 0) {
            a /= 10; // a 를 10으로 나눔
            b++;
        }

        System.out.println("그 수는 " + b + "자리입니다.");
    }
}
