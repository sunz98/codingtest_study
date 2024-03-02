
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken());
            int M = Integer.parseInt(st1.nextToken());

            int[] arr = new int[N * N];
            int[] idx = new int[N * N];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st2.nextToken());
                idx[j] = j;
            }

            int cnt = 0;
            int front = 0;
            int back = N;

            while (true) {
                int max = max(arr, front, back);

                if (arr[front] != max) {
                    push(arr, pop(arr, front, back), back);
                    push(idx, pop(idx, front, back), back);
                    front += 1;
                    back += 1;
                } else {
                    if (idx[front] == M) {
                        cnt += 1;
                        break;
                    } else {
                        front += 1;
                        cnt += 1;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void push(int[] arr, int num, int back) {
        arr[back] = num;
    }

    public static int empty(int front, int back) {
        if (front == back) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int pop(int[] arr, int front, int back) {
        if (empty(front, back) == 1) {
            return -1;
        } else {
            int num = arr[front];
            arr[front] = 0;
            return num;
        }
    }

    public static int max(int[] arr, int front, int back) {
        int max = 0;
        for (int i = front; i < back; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
