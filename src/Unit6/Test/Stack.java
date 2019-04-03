package Unit6.Test;

class Stack {
    private char[] stck; // массив для хранения стека
    private int top; // вершина стека

    // создание пустого стека заданной длины
    Stack(int size) {
        stck = new char[size];
        top = 0;
    }

    // Создать один стек из другого
    Stack(Stack ob) {
        top = ob.top;
        stck = new char[ob.stck.length];

        // Скопировать элементы
        if (top >= 0) System.arraycopy(ob.stck, 0, stck, 0, top);
    }

    // Создать стек с начальными значениями
    Stack(char[] a) {
        stck = new char[a.length];

        for (char c : a) {
            push(c);
        }
    }

    // Поместить символы в стек
    void push(char ch) {
        if (top == stck.length) {
            System.out.println("--Стек заполнен.");
            return;
        }

        stck[top] = ch;
        top++;
    }

    // Извлечь символы из стека
    char pop() {
        if (top == 0) {
            System.out.println("--Стек пуст.");
            return (char) 0;
        }

        top--;
        return stck[top];
    }
}

// Демонстрация использования стека.
class StackDemo {
    public static void main(String[] args) {
        // Создать пустой стек на 10 элементов
        Stack st1 = new Stack(10);

        char[] name = {'V', 'a', 'd', 'i', 'm'};

        // Создать стек из массива
        Stack st2 = new Stack(name);

        // Поместить символы в стек st1
        for (int i = 0; i < 10; i++) {
            st1.push((char) ('A' + i));
        }

        // Создать один стек из другого
        Stack st3 = new Stack(st1);

        // Отобразить стеки
        System.out.print("Содержимое стека st1: ");
        for (int i = 0; i < 10; i++) {
            char ch = st1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое стека st2: ");
        for (int i = 0; i < 5; i++) {
            char ch = st2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое стека st3: ");
        for (int i = 0; i < 10; i++) {
            char ch = st3.pop();
            System.out.print(ch);
        }
    }
}
