package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_10952_AplusBminus5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String line = br.readLine();
            String[] arr = line.split(" ");

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            if (A == 0 || B == 0) {
                break;
            }

            sb.append(A + B).append("\n");
        }

        System.out.println(sb);
    }
}

//// StringTokenizer 방식
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//
//            if (A == 0 || B == 0) {
//                break;
//            }
//
//            sb.append(A+B).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}
