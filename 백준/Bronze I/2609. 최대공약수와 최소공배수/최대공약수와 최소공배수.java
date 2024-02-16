import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 수 입력받기
        String num1 = sc.next();
        String num2 = sc.next();

        // 두 수 형변환
        int A = Integer.valueOf(num1);
        int B = Integer.valueOf(num2);

        int a, b, tmp;

        // 큰 수가 a, 작은 수가 b
        if (A >= B) {
            a = A;
            b = B;
        } else {
            a = B;
            b = A;
        }

        while (b != 0) {
            a = a % b;
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a);
        System.out.println(A * B / a);

        sc.close();
    }
}
