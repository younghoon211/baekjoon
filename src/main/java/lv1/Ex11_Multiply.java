package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 곱셈
// 너무 어렵게 생각마라
// 나머지(%) 와 나눗셈(/)을 활용하자
public class Ex11_Multiply {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        // a: 472
        // b: 385

        int c = a * (b % 10);
        int d = a * ((b % 100) / 10);
        int e = a * (b / 100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String a = br.readLine();
//        String b = br.readLine();
//        int intA = Integer.parseInt(a);
//        int intB = Integer.parseInt(b);
//
//        int c = intA * Integer.parseInt(b.substring(2,3));
//        int d = intA * Integer.parseInt(b.substring(1,2));
//        int e = intA * Integer.parseInt(b.substring(0,1));
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(intA * intB);
//    }
}
