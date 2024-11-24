// 1차원 배열
package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex01_10807_Count {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());
//        if (!(N>=1 && N<=100)) {
//            throw new IllegalArgumentException("1에서 100사이의 정수를 입력해주세요.");
//        }

        String[] arr2 = br.readLine().split(" ");
        int[] arr = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();


//        if (!(Arrays.stream(arr).mapToInt(Integer::parseInt).anyMatch(r -> r >= -100 && r<= 100))) {
//            throw new IllegalArgumentException("-100에서 100사이의 정수를 입력해주세요.");
//        }

        int v = Integer.parseInt(br.readLine());
//        if (!(v>=-100 && v<=100)) {
//            throw new IllegalArgumentException("-100에서 100사이의 정수를 입력해주세요.");
//        }

        for (int i = 0; i < N; i++) {
            if(arr[i] == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}


//        for (String r : arr) {
//            int ir = Integer.parseInt(r);
//            if (!(ir >= -100 && ir <= 100)) {
//                throw new IllegalArgumentException("-100에서 100 사이의 정수를 입력해주세요.");
//            }
//        }
