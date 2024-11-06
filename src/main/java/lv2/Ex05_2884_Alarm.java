package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알람 시계
public class Ex05_2884_Alarm {

    public static void main(String[] args) throws IOException {

        int a = 0;
        int b = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);

            if (a < 0 || a > 23 || b < 0 || b > 59) {
                throw new IOException("올바른 입력값이 아닙니다.");
            } else if (b >= 45) {
                b -= 45;
            } else if (a >= 1) { // a: 1~23
                b += 15;
                a -= 1;
            } else { // a: 0
                b += 15;
                a = 23;
            }

            System.out.println(a + " " + b);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            String[] str = br.readLine().split(" ");
//            a = Integer.parseInt(str[0]);
//            b = Integer.parseInt(str[1]);
//
//            if (a < 0 || a > 23 || b < 0 || b > 59) {
//                throw new IOException("올바른 입력값이 아닙니다.");
//            }
//
//            // b 45~59일 경우, b-45
//            // a: 유지
//            if (b >= 45 && b <= 59) {
//                b -= 45;
//
//            // 1<=a<=23
//            // b 0~44일 경우, b+15
//            // a: a-1
//            } else if (a >= 1 && a <= 23 && b >= 0 && b <= 44) {
//                b += 15;
//                a -= 1;
//
//            // a ==0
//            // b 0~44일 경우, b+15
//            // a: 23
//            } else if (a == 0 && b >= 0 && b <= 44) {
//                b += 15;
//                a = 23;
//            }
//
//            System.out.println(a + " " + b);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
