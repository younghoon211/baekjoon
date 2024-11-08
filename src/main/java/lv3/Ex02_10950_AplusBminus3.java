package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A+B-3
public class Ex02_10950_AplusBminus3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 최종 결과 길이
        int T = Integer.parseInt(br.readLine());

        // 최종 결과물 담을 배열
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            // 연산을 위한 임시 문자열 배열
            String[] temp = br.readLine().split(" ");

            int A = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);

            arr[i] = A + B;
        }

        for (int rslt : arr) {
            System.out.println(rslt);
        }
    }
}
