package Lesson5;

public class Third {
    public static void main(String[] args) {
        double[] num = {1.0, 1.3, 5.4, 1.2, 2.6, 6.3, 3.5, 6.6, 7.9, 10.0};
        double res = 0;

        for (double v : num) {
            res += v;
        }
        res /= num.length;
        System.out.println(res);
    }
}
