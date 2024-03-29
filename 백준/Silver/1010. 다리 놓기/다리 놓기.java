
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] dp = new int[M + 1][M + 1];

            for (int j = 1; j <= M; j++) {
                dp[1][j] = j;

                for (int k = 2; k <= j; k++) {
                    dp[k][j] = dp[k - 1][j - 1] + dp[k][j - 1];
                }
            }

            System.out.println(dp[N][M]);
        }
    }
}
