package Unit6.AccessModifiers;

public class FailSoftArray {
    private int[] a; // ссылка на массив
    private int errval; // значение, возвращаемое в случае
                        // возникновения ошибки при выполнении
                        // метода get()
    public int length;  // открытая переменная length

    /* конструктору данного класса передается размер массива и
       значение, которое должен возвращать метод get() при
       возникновении ошибки. */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        length = size;
        errval = errv;
    }

    // возвратить значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errval;
    }

    // установить значение элемента с заданным массивом
    // если возникает ошибка, возвратить логическое значение false
    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // вернуть логическое значение true, если индекс
    // не выходит за границы массива
    private boolean indexOk(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// демонстрация работы с "отказоустойчивым" массивом
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " ");
        }

        System.out.println();

        // обработка ошибок
        System.out.println("\nОбработка ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) System.out.println("Индекс " + i + " вне допустимого диапазона.");
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " вне допустимого диапазона.");
        }
    }
}
