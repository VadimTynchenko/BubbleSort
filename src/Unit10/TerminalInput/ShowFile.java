package Unit10.TerminalInput;

import java.io.*;

/* Отображение текстового файла.

При вызове этой программы следует указать имя файла,
содержимое которого требуется просмотреть.
Например, для вывода на экран содержимого файла TEST.TXT
необходимо ввести в комамандной строке следующую команду:

java ShowFile TEST.TXT
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Прежде всего необходимо убедиться в том, что программе
        // придется передать имя файла
        if (args.length != 1) {
            System.out.println("Искользование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            // Читать байты, пока не встретится символ EOF
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
