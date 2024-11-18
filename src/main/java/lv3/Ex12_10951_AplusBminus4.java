package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_10951_AplusBminus4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();

            if(line == null) {
                break;
            }

            String[] arr = line.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            if (A <= 0 || B >= 10) {
                break;
            }

            sb.append(A+B).append("\n");
        }

        System.out.println(sb);

    }
}
