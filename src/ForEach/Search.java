package ForEach;

// Поиск в массиве с использованием расширенного цикла for

public class Search {
    public static void main(String[] args) {
        int[] num = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использование цикла for-each для поиска
        // переменной val в массиве num
        for (int x :
                num) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Значение найдено!");
    }
}
