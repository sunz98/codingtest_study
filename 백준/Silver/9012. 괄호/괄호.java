
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            char[] arr = line.toCharArray();
            int len = arr.length;

            int front = 0;
            int back = 0;
            int cnt = 0;

            for (int j = 0; j < len; j++) {
                if (arr[j] == '(') {
                    front += 1;
                    cnt += 1;
                } else if (arr[j] == ')') {
                    back += 1;
                    cnt -= 1;
                }

                if (cnt < 0) {
                    break;
                }
            }

            if (arr[len - 1] == '(') {
                System.out.println("NO");
            } else {
                if (front == back) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
