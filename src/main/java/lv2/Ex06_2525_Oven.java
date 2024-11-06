package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오븐 시계
public class Ex06_2525_Oven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(br.readLine());

//        if (a < 0 || a > 23 || b < 0 || b > 59 || c > 1000) {
//            throw new IOException("올바른 입력값이 아닙니다.");
//        } else if () {
//
//        }

    }
}
