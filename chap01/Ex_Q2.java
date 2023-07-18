import java.util.Scanner;

public class Ex_Q2 { // 세 값의 최소값을 구하라
    static int min3(int a, int b, int c){
        int min = a; // 최소값
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 정수의 최소값을 구합니다.");
        System.out.print("a의 값: "); a = sc.nextInt();
        System.out.print("b의 값: "); b = sc.nextInt();
        System.out.print("c의 값: "); c = sc.nextInt();

        int max = min3(a, b, c);

        System.out.println("최솟값은 " + max + "입니다.");
    }
}
