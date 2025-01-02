package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08_3052_Remain {

    // boolean
    // 104ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(br.readLine()) % 42;
            arr[n] = true;
        }

        int cnt = 0;

        for (boolean a : arr) {
            if (a) {
                cnt++;
            }
        }

    }

    // int
    // 104ms
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] arr = new int[42];
//
//        for (int i = 0; i < 10; i++) {
//            int n = Integer.parseInt(br.readLine()) % 42;
//            arr[n] = 1;
//        }
//
//        int cnt = 0;
//
//        for (int a : arr) {
//            if (a == 1) {
//                cnt++;
//            }
//        }
//
//        System.out.println(cnt);
//    }
}
