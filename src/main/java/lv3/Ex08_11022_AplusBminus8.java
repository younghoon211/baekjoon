package lv3;

import java.io.*;

public class Ex08_11022_AplusBminus8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String input = br.readLine();

            if (input == null) {
                break;
            }

            String[] strArr = input.split(" ");
            int A = Integer.parseInt(strArr[0]);
            int B = Integer.parseInt(strArr[1]);

            if (!(A > 0 && B < 10)) {
                throw new IllegalArgumentException("올바른 입력값이 아닙니다.");
            }

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
            bw.newLine();
        }

        bw.flush();
    }
}

