package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_9086_String {

    // 100ms
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String S = br.readLine();

            sb.append(S.charAt(0)).append(S.charAt(S.length()-1)).append(System.lineSeparator());
        }


        System.out.println(sb);

    }

    // 124ms
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        String rslt = "";
//
//        for (int i = 0; i < T; i++) {
//
//            String S = br.readLine();
//
//            rslt += Character.toString(S.charAt(0)) + Character.toString(S.charAt(S.length()-1)) + System.lineSeparator();
//        }
//
//        System.out.println(rslt);
//    }
}
