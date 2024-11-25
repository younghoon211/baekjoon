package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03_10818_MinAndMax {

    // 456ms
    // math, split
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        if (arr.length != N) {
            throw new IllegalArgumentException("인자의 개수가 일치하지 않습니다.");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<N; i++) {
            int number = Integer.parseInt(arr[i]);
            min = Math.min(min, number); // 초기값은 arr[0] 이지만, arr[1] 부터는 더 작은 값으로 갱신
            max = Math.max(max, number); // 초기값은 arr[0] 이지만, arr[1] 부터는 큰 값으로 갱신
        }

        System.out.print(min +  " " + max);
    }

    // 480ms
    // math, StringTokenizer
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        if (st.countTokens() != N) {
//            throw new IllegalArgumentException("인자의 개수가 일치하지 않습니다.");
//        }
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        while (st.hasMoreTokens()) {
//            int number = Integer.parseInt(st.nextToken());
//            min = Math.min(min, number);
//            max = Math.max(max, number);
//        }
//
//        System.out.print(min +  " " + max);
//    }

    // 496ms
    // for문
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//        String[] arr = br.readLine().split(" ");
//
//        int min = Integer.parseInt(arr[0]);
//        int max = Integer.parseInt(arr[0]);
//
//        for(int i = 1; i < a; i++) {
//            if (min > Integer.parseInt(arr[i])) {
//                min = Integer.parseInt(arr[i]);
//            }
//
//            if (max < Integer.parseInt(arr[i])) {
//                max = Integer.parseInt(arr[i]);
//            }
//        }
//
//        System.out.print(min +  " " + max);
//    }

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
