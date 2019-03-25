package Lesson5;

public class Fifth {
    public static void main(String[] args) {

        String s = "indexOf and lastIndexOf";

        System.out.println(s.indexOf("Of"));
        System.out.println(s.lastIndexOf("Of"));

        // разница между indexOf от lastIndexOf состоит в том, что первый метод
        // возвращает число первого найденого символа в строке,
        // а второй метод возвращает число последнего найденого совпадения
        // в строке
    }
}
