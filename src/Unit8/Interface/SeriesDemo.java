package Unit8.Interface;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos obTwo = new ByTwos();
        ByThrees obThree = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = obTwo;
            System.out.println("Следующее значение ByTwo: " + ob.getNext());

            ob = obThree;
            System.out.println("Следующее значение ByThree: " + ob.getNext());
        }
    }
}
