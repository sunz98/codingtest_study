
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        board += " ";
        ArrayList<String> arr = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) == 'X') {
                cnt += 1;
            } else {
                if (cnt % 2 == 0) {
                    if (cnt >= 4) {
                        int num = cnt / 4;
                        for (int j = 0; j < num; j++) {
                            arr.add("AAAA");
                        }
                        cnt -= num * 4;
                    }
                    for (int j = 0; j < (cnt / 2); j++) {
                        arr.add("BB");
                        cnt -= 2;
                    }

                    if (i != board.length() - 1) {
                        arr.add(".");
                    }
                } else {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
