
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st1.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> card = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            card.add(Integer.parseInt(st2.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            res.add(find(arr, 0, N - 1, card.get(i)));
        }

        for (int i = 0; i < M - 1; i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.print(res.get(M - 1));

    }

    public static int find(ArrayList<Integer> arr, int start, int last, int num) {
        if (start > last) {
            return 0;
        } else {
            int mid = (start + last) / 2;
            if (arr.get(mid) < num) {
                return find(arr, (mid + 1), last, num);
            } else if (arr.get(mid) > num) {
                return find(arr, start, mid - 1, num);
            }
            return 1;
        }
    }
}
