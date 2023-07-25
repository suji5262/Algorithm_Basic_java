import java.util.Scanner;

public class Ex_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("a의 값: ");
        a = sc.nextInt();

        do {
            System.out.print("b의 값: ");
            b = sc.nextInt();

            if (b<a) {
                System.out.println("a보다 큰 값을 입력하세요!");
            } else {
                int sum = b - a;
                System.out.println("b - a는 " + sum + "입니다.");
            }
        } while (true);
    }
}
