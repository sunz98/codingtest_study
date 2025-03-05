
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] bulb = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            bulb[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());
            int c = Integer.parseInt(st3.nextToken());

            if (a == 1) {
                bulb[b - 1] = c;
            } else if (a == 2) {
                int cnt = c - b + 1;
                for (int j = 0; j < cnt; j++) {
                    if(bulb[b + j - 1] == 0) {
                        bulb[b + j - 1] = 1;
                    } else {
                        bulb[b + j - 1] = 0;
                    }
                }
            } else if (a == 3) {
                int cnt = c - b + 1;
                for (int j = 0; j < cnt; j++) {
                    bulb[b + j - 1] = 0;
                }
            } else if (a == 4) {
                int cnt = c - b + 1;
                for (int j = 0; j < cnt; j++) {
                    bulb[b + j - 1] = 1;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(bulb[i] + " ");
        }

        System.out.println(sb);
    }

}
