package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08_1152_Number_Of_Word {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        if (S.matches(" ")) {
            System.out.println(0);
        } else {
            String[] arr = S.strip().split(" ");
            System.out.println(arr.length);
        }
    }
}
