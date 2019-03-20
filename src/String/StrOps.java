package String;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер интернета!";
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны.";
        int result, idx;
        char ch;

        System.out.println("Длинна строки str1: " + str1.length()); // длинна строки

        // отображение строки посимвольно
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();

        // сравнение строк по значению
        // str1 и str2
        if (str1.equals(str2)) {
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str2");
        }

        // str1 и str3
        if (str1.equals(str3)) {
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str3");
        }

        result = str1.compareTo(str3);
        System.out.println(result); // сравнение длин строк str1 и str3
                                        // если равны, то result = 0
                                        // если str1 больше str3, result > 0
                                        // если str1 меньше str3, result < 0
        if (result == 0) {
            System.out.println("str1 и str3 равны");
        } else if (result < 0) {
            System.out.println("str1 меньше str3");
        } else {
            System.out.println("str1 больше str3");
        }

        // присвоение переменной str2 новую строку
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения \"One\": " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения \"One\": " + idx);
    }
}
