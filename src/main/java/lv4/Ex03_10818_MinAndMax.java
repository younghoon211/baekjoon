package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_10818_MinAndMax {

    // 496ms
    // for문
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(int i = 1; i < a; i++) {
            if (min > Integer.parseInt(arr[i])) {
                min = Integer.parseInt(arr[i]);
            }

            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
        }

        System.out.print(min +  " " + max);
    }

    // 1192ms
    // Arrays.sort 메소드
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        String[] strArr = br.readLine().split(" ");
//
//        int[] intArr = new int[a];
//
//        for(int i = 0; i<a; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//
//        Arrays.sort(intArr);
//
//        System.out.println(intArr[0]);
//        System.out.println(intArr[a-1]);
//
//    }
}
