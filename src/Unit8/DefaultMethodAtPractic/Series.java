package Unit8.DefaultMethodAtPractic;

// Усовершенствованная версия интерфейса Series, которая включает
// используемый по умолчанию метод getNextArray()
public interface Series {
    int getNext(); // Вернуть следующее число в ряду

    // Возвратить массив, который содержит n элементов, распологающиеся
    // в ряду вслед за текущим элементов
    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }

        return vals;
    }

    void rest(); // сброс

    void setStart(int x); // установка начального значения
}
