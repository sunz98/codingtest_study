
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int res = 0;

        for (int i = N - 1; i > 0; i--) {
            int sum = i;
            String num = Integer.toString(i);

            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '0') {
                    sum = -1111111;
                }
                sum += (int) num.charAt(j) - '0';
            }
            if (sum == N) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}
