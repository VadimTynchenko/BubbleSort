package BitwiseOperations;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // зашифровка сообщения
        for (int i = 0; i < msg.length(); i++) {
            // Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // декодирование сообщения
        for (int i = 0; i < msg.length(); i++) {
            // Построение дешифрованной строки сообщения
            decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
