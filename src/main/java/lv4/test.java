// 1차원 배열
package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (!(N>=1 && N<=100)) {
            throw new IllegalArgumentException("1에서 100사이의 정수를 입력해주세요.");
        }

        String[] arr = br.readLine().split(" ");


        if (!(Arrays.stream(arr).mapToInt(Integer::parseInt).anyMatch(r -> r >= -100 && r<= 100))) {
            throw new IllegalArgumentException("-100에서 100사이의 정수를 입력해주세요.");
        }

        int v = Integer.parseInt(br.readLine());
        if (!(v>=-100 && v<=100)) {
            throw new IllegalArgumentException("-100에서 100사이의 정수를 입력해주세요.");
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {

            if(Integer.parseInt(arr[i]) == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
