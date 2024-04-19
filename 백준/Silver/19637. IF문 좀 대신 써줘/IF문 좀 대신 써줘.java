
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        String[] level = new String[N];
        int[] power = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            level[i] = st2.nextToken();
            power[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());

            int left = 0;
            int right = N;
            int res = 0;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (power[mid] >= num) {
                    res = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            sb.append(level[res]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
