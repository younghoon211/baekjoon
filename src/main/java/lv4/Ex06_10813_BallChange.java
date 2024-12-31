package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_10813_BallChange {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = br.readLine().split(" ");
        int N = Integer.parseInt(arr1[0]);
        int M = Integer.parseInt(arr1[1]);

        int[] rslt = new int[N];

        for (int a = 0; a < N; a++) {
            rslt[a] = a + 1;
        }

        for (int b = 0; b < M; b++) {
            String[] arr2 = br.readLine().split(" ");
            int i = Integer.parseInt(arr2[0]) - 1;
            int j = Integer.parseInt(arr2[1]) - 1;

            int tmp = rslt[i];
            rslt[i] = rslt[j];
            rslt[j] = tmp;
        }

        for (int c = 0; c < N; c++) {
            System.out.print(rslt[c] + " ");
        }
    }
}
