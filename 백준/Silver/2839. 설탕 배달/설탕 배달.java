
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int min, max;

        if (N % 5 != 0) {
            min = (N / 5) + 1;
        } else {
            min = N / 5;
        }

        if (N % 3 != 0) {
            max = (N / 3) + 1;
        } else {
            max = N / 3;
        }

        int[][] dp = new int[max + 1][max + 1];
        int res = 0;

        for (int i = min; i <= max; i++) {
            res = -1;

            for (int j = 0; j <= i; j++) {
                dp[j][i - j] = (3 * j) + (5 * (i - j));

                if (dp[j][i - j] == N) {
                    res = i;
                    break;
                }
            }

            if (res != -1) {
                break;
            }
        }

        System.out.println(res);
    }
}
