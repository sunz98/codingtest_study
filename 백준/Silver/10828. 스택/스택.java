
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String ins = st.nextToken();

            switch (ins) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(arr, num);
                    break;
                case "size":
                    System.out.println(size(arr));
                    break;
                case "empty":
                    System.out.println(empty(arr));
                    break;
                case "top":
                    System.out.println(top(arr));
                    break;
                case "pop":
                    System.out.println(pop(arr));
                    break;
            }
        }

    }

    public static void push(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                break;
            }
        }
    }

    public static int size(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static int empty(int[] arr) {
        if (size(arr) == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int pop(int[] arr) {
        if (empty(arr) == 1) {
            return -1;
        } else {
            int idx = size(arr) - 1;
            int num = arr[idx];
            arr[idx] = 0;
            return num;
        }
    }

    public static int top(int[] arr) {
        if (empty(arr) == 1) {
            return -1;
        } else {
            int idx = size(arr) - 1;
            return arr[idx];
        }
    }

}
