package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년
public class Ex03_2753_LeapYear {

    public static void main(String[] args) throws IOException {

        // 윤년이면 1, 아니면 0 출력
        // 4의 배수 & (!100의 배수 || 400의 배수)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        boolean isLeapYear = (a%4 == 0) && ((a % 100 != 0) || (a % 400 == 0));

        if (isLeapYear) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
