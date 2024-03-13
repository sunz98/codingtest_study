
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int a = num[0];
        int b = num[1];
        int c = num[2];
        int d = num[3];
        int e = num[4];
        int f = num[5];

        int x = 0;
        int y = 0;

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i + b * j == c) && (d * i + e * j == f)) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
    }
}
