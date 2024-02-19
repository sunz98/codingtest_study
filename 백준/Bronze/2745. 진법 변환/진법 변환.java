import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] arr = N.toCharArray();

        int B = sc.nextInt();
        int res = 0;

        int num = N.length();
        for (int i = 0; i < num; i++) {
            char word = arr[num - i - 1];
            int ascii = (int) word;

            if (ascii < 65) {
                res += (ascii - 48) * Math.pow(B, i);
            } else {
                res += (ascii - 55) * Math.pow(B, i);
            }
        }

        System.out.println(res);
        sc.close();
    }
}
