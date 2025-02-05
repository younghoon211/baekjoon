package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09_2908_Constant {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");

        boolean isContainA0 = arr[0].contains("0");
        boolean isContainB0 = arr[1].contains("0");

        if (isContainA0 || isContainB0) {
            throw new IllegalArgumentException("입력값 중 0이 포함되어 있지 않아야 합니다.");
        } else {
            int A = Integer.parseInt(String.valueOf(sb.append(arr[0]).reverse()));
            sb.delete(0, 3);

            int B = Integer.parseInt(String.valueOf(sb.append(arr[1]).reverse()));
            sb.delete(0, 3);

            if (A > B) {
                System.out.println(A);
            } else {
                System.out.println(B);
            }
        }

    }
}