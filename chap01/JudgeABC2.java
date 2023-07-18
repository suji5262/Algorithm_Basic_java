import java.util.Scanner;

public class JudgeABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int n = sc.nextInt();

        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else if (n == 3)
            System.out.println("C");
        // 1,2,3 이외의 값이면 아무것도 출력하지 않음
        // JudgeABC3 에서 완전한 코드를 볼 수 있음
    }
}
