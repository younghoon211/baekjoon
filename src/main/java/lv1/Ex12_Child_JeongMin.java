package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 꼬마 정민
public class Ex12_Child_JeongMin {

    // int : ~ 10의 9승
    // long : ~ 10의 18승
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        long c = Long.parseLong(str[2]);

        System.out.println(a+b+c);
    }
}
