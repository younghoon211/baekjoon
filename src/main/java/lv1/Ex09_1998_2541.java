package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 	1998년생인 내가 태국에서는 2541년생?!
public class Ex09_1998_2541 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = input - 543;

        System.out.println(result);
    }
}
