package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//구구단
public class Ex01_2739_99dan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int i = 1;
        while (i <= 9) {
            System.out.println(a + " * " + i + " = " + (a * i));
            i++;
        }

//            for (int i = 1; i <= 9; i++) {
//                System.out.println(a + " * " + i + " = " + (a * i));
//            }

    }
}
