import java.util.Scanner;

public class Ex_Q1 {

    static int max4(int a, int b, int c, int d){ // a, b, c, d 최댓값을 구해 반환
        int max = a; // 최댓값
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값: "); a = sc.nextInt();
        System.out.print("b의 값: "); b = sc.nextInt();
        System.out.print("c의 값: "); c = sc.nextInt();
        System.out.print("d의 값: "); d = sc.nextInt();

        int max = max4(a, b, c, d);

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
