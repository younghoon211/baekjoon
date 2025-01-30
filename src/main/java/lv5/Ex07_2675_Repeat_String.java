package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_2675_Repeat_String {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int R = Integer.parseInt(arr[0]);
            String S = arr[1];

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                }
                // 대체 가능
                // sb.append(String.valueOf(S.charAt(j)).repeat(R));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
