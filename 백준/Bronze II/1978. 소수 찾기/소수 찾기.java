import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력받기
        int num = sc.nextInt();
        // N 크기의 배열 생성
        int[] array = new int[num];
        int res = 0;
        // 수 입력받기
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (array[i] != 1) {
                int cnt = 0;
                // array[i]까지 돌기보다 루트 array[i]까지 도는게 시간 절약
                for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                    if (array[i] % j == 0) {
                        cnt += 1;
                    }
                }

                if (cnt == 0) {
                    res += 1;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}
