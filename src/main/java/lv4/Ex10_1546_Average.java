package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_1546_Average {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목 갯수
        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        // 가장 높은 점수
        int M = Integer.parseInt(arr[0]);

        for (int i = 1; i < N; i++) {
            int score = Integer.parseInt(arr[i]);
            if (M < score) {
                M = score;
            }
        }

        // 조작한 점수들
        float[] rslt = new float[N];

        for (int i = 0; i < N; i++) {
            rslt[i] = (Float.parseFloat(arr[i]) / M) * 100;
        }

        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += rslt[i];
        }

        float avg = sum / N ;

        System.out.println(avg);

    }
}
