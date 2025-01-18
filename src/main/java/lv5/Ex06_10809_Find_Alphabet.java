package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex06_10809_Find_Alphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int[] rslt = new int[26];

        Arrays.fill(rslt, -1);

        for (int i = 0; i < S.length(); i++) {
            int asc = S.charAt(i) - 'a';
            if (rslt[asc] == -1) {
                rslt[asc] = i;
            }
        }

        for (int r : rslt) {
            System.out.print(r + " ");
        }
    }
}
