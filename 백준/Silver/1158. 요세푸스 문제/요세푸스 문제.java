
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

        int[] arr = new int[N];
        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int idx = 0;
        int size = N;

        while (size > 0) {
            idx = (idx + K - 1) % size;
            res[N - size] = arr[idx];

            for (int i = idx; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        System.out.print('<');
        for (int i = 0; i < N - 1; i++) {
            System.out.print(res[i] + ", ");
        }
        System.out.print(res[N - 1] + ">");
    }
}
