package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03_A_plus_B {

    public static void main(String[] args) throws Exception {
        System.out.println(sol1());
//        System.out.println(sol2());
    }

    // scanner
    public static int sol1() throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        sc.close();

        return a+b;
    }

    // BufferedReader
    public static int sol2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        return a+b;
    }



}
