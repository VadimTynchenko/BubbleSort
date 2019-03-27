package Unit5.Lesson5;

public class Second {
    public static void main(String[] args) {
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        for (int res :
                num) {
            System.out.print(res + " ");
        }
    }
}
