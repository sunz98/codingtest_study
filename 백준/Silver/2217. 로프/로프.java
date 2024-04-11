
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int res = 0;

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        // sorting
        arr.sort(Comparator.naturalOrder());

        for (int i = 0; i < N; i++) {
            if (res <= (arr.get(i) * (N - i))) {
                res = arr.get(i) * (N - i);
            }
        }

        System.out.println(res);
    }
}
