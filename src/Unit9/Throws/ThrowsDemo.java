package Unit9.Throws;

import java.io.IOException;

// Использование ключевого слова throws
public class ThrowsDemo {
    public static char prompt(String str) throws IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        } catch (IOException e) {
            System.out.println("Произошло исключение ввода-вывода!");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу " + ch);
    }
}
