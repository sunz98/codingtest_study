
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int cnt = num.charAt(i) - '0';
            sb.append(cnt / 4);
            cnt = cnt % 4;
            sb.append(cnt / 2);
            cnt = cnt % 2;
            sb.append(cnt);
        }

        for (int i = 0; i < 2; i++) {
            if (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
        }
        System.out.println(sb);
    }

}
