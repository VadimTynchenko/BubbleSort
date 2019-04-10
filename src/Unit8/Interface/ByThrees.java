package Unit8.Interface;

public class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void rest() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int start) {
        this.start = start;
        val = start;
    }
}
