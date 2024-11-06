package lv1;

public class Ex02_StringPrintBack {

    public static void main(String[] args) {

        System.out.println(sol1("안녕하세요"));
        System.out.println(sol2("안녕하세요"));
        System.out.println(sol3("안녕하세요"));
    }

    // for문
    public static String sol1(String example) {
        String result = "";

        for (int i = example.length()-1; i >= 0; i--) {
            result += example.charAt(i);
        }

        return result;
    }

    // while문
    public static String sol2(String example) {
        String result = "";

        int exLength = example.length() - 1;

        while (exLength >= 0) {
            result += example.charAt(exLength--);
        }

        return result;
    }

    // StringBuilder
    public static String sol3(String example) {
        String result = "";
        StringBuilder sb = new StringBuilder();

        for (int i = example.length() - 1; i >= 0; i--) {
            sb.append(example.charAt(i));
        }

        return String.valueOf(sb);
    }
}
