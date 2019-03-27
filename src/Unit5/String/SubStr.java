package Unit5.String;

public class SubStr {
    public static void main(String[] args) {
        String str = "Java - двигатель интернета!";

        // формирование подстроки
        String subStr = str.substring(7, 26);

        System.out.println("Str = " + str);
        System.out.println("SubStr = " + subStr);
    }
}
