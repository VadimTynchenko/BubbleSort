package Unit8.Interface;

//Реализация интерфейса Series
public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void rest() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int start) {
        this.start = start;
        val = start;
        prev = start - 2;
    }

    int getPrev() {
        return prev;
    }
}
