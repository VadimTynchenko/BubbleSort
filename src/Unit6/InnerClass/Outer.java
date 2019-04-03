package Unit6.InnerClass;

// Применение внутреннего класса
class Outer {
    private int[] numbs;

    Outer(int[] n) {
        numbs = n;
    }

    void Analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Middle: " + inOb.avg());
    }

    // Внутренний класс
    class Inner {
        int min() {
            int m = numbs[0];

            for (int i = 1; i < numbs.length; i++) {
                if (numbs[i] < m) m = numbs[i];
            }
            return m;
        }

        int max() {
            int m = numbs[0];

            for (int i = 1; i < numbs.length; i++) {
                if (numbs[i] > m) m = numbs[i];
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int num : numbs) {
                a += num;
            }
            return a / numbs.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outer = new Outer(x);

        outer.Analyze();
    }
}