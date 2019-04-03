package Unit6.InnerClass;

// Применение вложенного класса ShowBits в качестве локального
public class LocalClassDemo {
    public static void main(String[] args) {

        class ShowBits {
            private int numBits;

            ShowBits(int x) {
                numBits = x;
            }

            void show(long val) {
                long mask = 1;

                // Сдвиг влево для установки еденицы в нужной позиции
                mask <<= numBits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 5) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (short b = 0; b <= 2048; b++) {
            ShowBits showBits = new ShowBits(15);

            System.out.print(b + " В двоичном представлении: ");
            showBits.show(b);
            System.out.println();
        }
    }
}
