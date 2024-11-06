package lv1;

import java.io.*;

// ??!
public class Ex08_In_Out {

    //100ms / buffer:104ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String read = br.readLine();
        String result = String.valueOf(sb.append(read).append("??!"));

        System.out.println(result);
    }

//    //104ms
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        String read = br.readLine();
//        String result = read + sb.append("??!");
//
//        System.out.println(result);
//    }
//
//    //112ms
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(br.readLine() + "??!");
//    }
}
