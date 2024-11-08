package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오븐 시계
public class Ex06_2525_Oven {

    // -= 순서 헷갈리지 않기 (=- 아님)
    // 문자열과 더하면 int도 문자열 취급 (괄호 사용)
    // BufferedReader 클래스 사용시 JVM에 던지기보단, 직접 예외처리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(br.readLine());


        if (a < 0 || a > 23 || b < 0 || b > 59 || c > 1000) {
            throw new IllegalArgumentException("올바른 입력값이 아닙니다.");
        } else {
            a += (b + c) / 60;

            if (a > 23) {
                a -= 24;
            }

            System.out.println((a) + " " + ((b + c) % 60));

            //c 최대 : 17 (c1000,b59)
            // 출력1 : a += (b+c)/60 ,  if (a>23) a =- 24
            // 출력2 : (b+c) % 60

        }
    }
}
