package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주사위 3개
public class Ex07_2480_3Dice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        if (a < 1 || a > 6 || b < 1 || b > 6 || c < 1 || c > 6) {
            throw new IllegalArgumentException("올바른 입력값이 아닙니다.");
        } else {
            boolean case1 = (a == b);
            boolean case2 = (b == c);
            boolean case3 = (a == c);
            int rslt = 0;

            if (case1 && case2) {
                rslt = 10000 + a * 1000;
            } else if (case1 || case2 || case3) {
                if (case1) {
                    rslt = 1000 + a * 100;
                } else if (case2) {
                    rslt = 1000 + b * 100;
                } else { // case1,2 둘다 아니면 3이니 else
                    rslt = 1000 + c * 100;
                }
            } else {
                if ((a > b && b > c) || (a > c && c > b)) {
                    rslt = a * 100;
                } else if ((b > a && a > c) || (b > c && c > a)) {
                    rslt = b * 100;
                } else {
                    rslt = c * 100;
                }
            }

            System.out.println(rslt);
        }
    }
}

// 초기 (else문 정리 x)
//public class Ex07_2480_3Dice {
//
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//
//            String[] str = br.readLine().split(" ");
//            int a = Integer.parseInt(str[0]);
//            int b = Integer.parseInt(str[1]);
//            int c = Integer.parseInt(str[2]);
//
//            if (a < 1 || a > 6 || b < 1 || b > 6 || c < 1 || c > 6 ) {
//                throw new IOException("올바른 입력값이 아닙니다.");
//            } else {
//                boolean case1 = (a == b);
//                boolean case2 = (b == c);
//                boolean case3 = (a == c);
//                int rslt = 0;
//
//                if (case1 && case2) {
//                    rslt = 10000 + a * 1000;
//                } else if (case1 || case2 || case3) {
//                    if (case1) {
//                        rslt = 1000 + a * 100;
//                    } else if (case2) {
//                        rslt = 1000 + b * 100;
//                    } else if (case3) {
//                        rslt = 1000 + c * 100;
//                    }
//                } else {
//                    if ((a > b && b > c) || (a > c &&  c > b)) {
//                        rslt = a * 100;
//                    } else if ((b > a && a > c) || (b > c && c > a)) {
//                        rslt = b * 100;
//                    } else if ((c > a && a > b) || (c > b && b > a)) {
//                        rslt = c * 100;
//                    }
//                }
//
//                System.out.println(rslt);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
