package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 코딩은 체육과목 입니다
public class Ex05_25314_CodingIsGymSubjects {

    // 문자열 이어붙일땐 String 보단 StringBuilder 쓰기
    // 변수명 신경쓰기 (가독성)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N % 4 != 0 || !(N >= 4 && N <= 1000)) {
            throw new IllegalArgumentException("올바르지 않은 입력값입니다.");
        }

        int longCount = (N / 4);
        for (int i = 0; i < longCount; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);

    }
}

//            문자열 이용 (권장x)
//            String rslt = "";
//
//            for (int i = 0; i < longCount; i++) {
//                rslt = "long " + rslt;
//            }
//
//            rslt += "int";
//
//            System.out.println(rslt);
