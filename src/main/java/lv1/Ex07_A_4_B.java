package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_A_4_B {

    // IOException 처리 이유
    // BufferedReader와 BufferedWriter 클래스의 메소드들은 입출력에러가 발생할 경우
    // 자체적으로 IOException을 던지도록 정의되어있다.
    // 그러므로 이 메소드들을 사용할 때 반드시 예외처리를 해주어야 한다.


    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.in            : 키보드 입력
    // InputStreamReader    : 바이트 기반 스트림인 System.in을 문자 기반 스트림으로 변경
    // BufferedReader       : 입력 스트림을 버퍼링하여 더 효율적으로 읽을 수 있도록 해주는 클래스
    //                        입력을 한 번에 읽고 버퍼에 저장한 다음, 필요할 때마다 버퍼에서 데이터를 가져옴
    //                        readLine()으로 한줄씩 데이터를 읽어올 수 있음 (InputStreamReader의 read는 한문자씩)

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        String[] str = sc.nextLine().split(" ");
//
//        sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
