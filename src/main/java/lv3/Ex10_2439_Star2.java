package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별찍기2
public class Ex10_2439_Star2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {

            for (int j =0; j<N-(i+1); j++) {
                System.out.print(" ");
            }


            for(int j = 0; j<i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
