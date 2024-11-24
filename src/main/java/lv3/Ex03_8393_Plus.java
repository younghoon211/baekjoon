package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_8393_Plus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int tmp = 0;

        for (int i = 1; i <= a; i++) {
            tmp += i;
        }

//            while(a > 0) {
//                tmp += a;
//                a--;
//            }

        System.out.println(tmp);
    }
}
