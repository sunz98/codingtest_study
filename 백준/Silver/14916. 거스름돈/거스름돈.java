
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;

        int big = N / 5;
        for (int i = 0; i < big; i++) {
            arr.add(5);
            cnt += 5;
        }

        while (true) {
            int num = N - cnt;
            if ((num % 2) == 0) {
                for (int i = 0; i < (num / 2); i++) {
                    arr.add(2);
                    cnt += 2;
                }
                break;
            } else {
                if (arr.size() == 0) {
                    break;
                } else {
                    arr.remove(0);
                    cnt -= 5;
                }
            }
        }

        if (arr.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr.size());
        }

    }
}
