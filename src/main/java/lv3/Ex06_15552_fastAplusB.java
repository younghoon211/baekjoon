package lv3;

import java.io.*;

// 빠른 A+B
// 문자열 + sout : 초과
// sb + sout : 844
// sb + bw : 852
// 문자열 + bw : 892
// bw : 884
public class Ex06_15552_fastAplusB {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] tmp = br.readLine().split(" ");
            int sum = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);

            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
    }
}
