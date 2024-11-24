package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex02_10871_SmallerThanX {

    // 148ms
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        for(int i = 0; i<arr2.length; i++) {
            if (Integer.parseInt(arr2[i]) < Integer.parseInt(arr1[1])) {
                sb.append(arr2[i]).append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);

    }

    // 348ms
    // Stream
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] arr1 = br.readLine().split(" ");
//        String[] arr2 = br.readLine().split(" ");
//
//        int[] rslt = Arrays.stream(arr2).mapToInt(Integer::parseInt).filter(num -> num < Integer.parseInt(arr1[1])).toArray();
//
//        for (int i = 0; i < rslt.length - 1; i++) {
//            System.out.print(rslt[i]);
//            System.out.print(" ");
//        }
//
//        System.out.print(rslt[rslt.length - 1]);
//    }
}
