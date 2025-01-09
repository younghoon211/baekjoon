package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_11720_Number_Plus {

    // toCharArray 104ms
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();

        char[] arr = input.toCharArray();

        int rslt = 0;
        for (int i = 0; i < N; i++) {
            rslt += Character.getNumericValue(arr[i]);
        }

        System.out.println(rslt);
    }

    // charAt 104ms
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        String input = br.readLine();
//
//        int rslt = 0;
//
//        for (int i = 0; i < N; i++) {
//            rslt += Character.getNumericValue(input.charAt(i));
//        }
//
//        System.out.println(rslt);
//    }

    //sb 108ms
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//
//        sb.append(br.readLine());
//
//
//        int rslt = 0;
//
//        for (int i = 0; i < N; i++) {
//            rslt += Character.getNumericValue(sb.charAt(i));
//        }
//
//        System.out.println(rslt);
//    }
}
