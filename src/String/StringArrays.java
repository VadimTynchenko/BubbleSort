package String;

public class StringArrays {
    public static void main(String[] args) {
        String[] str = {"Эта ", "строка ", " является ", "тестом."};

        System.out.println("Исходный массив: ");
        for (String s :
                str) {
            System.out.print(s);
        }
        System.out.println("\n");

        // изменить строку
        str[2] = "так же является ";
        str[3] = "тестом!";

        System.out.println("Измененный массив: ");
        for (String s :
                str) {
            System.out.print(s);
        }
    }
}
