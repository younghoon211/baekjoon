package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_10810_BallGoal {

    // 120ms
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[] rslt = new int[N];

        for (int a = 0; a < M; a++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            for (int b = i - 1; b < j; b++) {
                rslt[b] = k;
            }
        }

        for (int i = 0; i < rslt.length-1; i++) {
            System.out.print(rslt[i] + " ");
        }

        System.out.print(rslt[rslt.length-1]);
    }
}
