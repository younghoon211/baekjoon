package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//영수증
public class Ex04_25304_receipt {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // IllegalArgumentException : 잘못된 인자가 메소드에 전달될 경우
        // IllegalStateException : 메소드를 실행할 수 없을 경우

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        if (!(X >= 1 && X <= 1000000000 && N >= 1 && N <= 100)) {
            throw new IllegalArgumentException("올바르지 않은 입력값입니다.");
        }

        // 배열 사용: 메모리 사용이 크므로
//            int[] arr = new int[N];

        int sum = 0;
//            int a = 0;
//            int b = 0;

        // tmp, a, b는 for문 안에서 매번 다른 입력값을 받으므로 for문 블럭 안에 초기화
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);

            if (!(a >= 1 && a <= 1000000 && b >= 1 && b <= 10)) {
                throw new IllegalArgumentException("올바르지 않은 입력값입니다.");
            }

            sum += a * b;
        }

//            int sumArr = 0;
//            for (int r : arr) {
//                sumArr += r;
//            }

//            if (X == sumArr) {
        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
