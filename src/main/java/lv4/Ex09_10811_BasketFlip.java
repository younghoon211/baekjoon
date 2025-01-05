package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09_10811_BasketFlip {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[] rslt = new int[N];

        for (int i = 0; i < N; i++) {
            rslt[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            String[] arr2 = br.readLine().split(" ");
            int a = Integer.parseInt(arr2[0]) - 1;
            int b = Integer.parseInt(arr2[1]) - 1;

            while (a < b) {
                int tmp = rslt[a];
                rslt[a] = rslt[b];
                rslt[b] = tmp;
                a++;
                b--;
            }

        }

        for (int i = 0; i < N; i++) {
            System.out.print(rslt[i] + " ");
        }
    }
}
