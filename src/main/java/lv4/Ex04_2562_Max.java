package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값
public class Ex04_2562_Max {

    // ms
    // 배열x
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > max) {
                max = n;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }

    // 104ms
    // 배열
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[9];
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < 9; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//            max = Math.max(max, arr[i]);
//        }
//
//        int temp = 0;
//
//        for (int i = 0; i < 9; i++) {
//            if (arr[i] == max) {
//                temp = i + 1;
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(temp);
//    }
}
