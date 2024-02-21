import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N - 1];
        int[] remove = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            arr[i] = i + 2;
            remove[i] = 0;
        }

        int cnt = 0;
        int idx = 0;

        while (cnt != K) {
            for (int i = 0; i < arr.length; i++) {
                if (remove[i] == 0) {
                    int P = arr[idx];

                    if (arr[i] % P == 0) {
                        cnt += 1;
                        remove[i] = 1;
                    }

                    if (cnt == K) {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
            idx += 1;
        }

    }
}
