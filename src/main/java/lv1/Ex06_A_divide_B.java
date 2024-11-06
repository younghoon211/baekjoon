package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_A_divide_B {

    // float이 아니라 double인 이유?
    // float은 8자리까지밖에 표현 못함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);

        System.out.println(a / b);
    }
}
