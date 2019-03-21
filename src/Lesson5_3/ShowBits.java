package Lesson5_3;

public class ShowBits {
    int numBits;

    public ShowBits(int numBits) {
        this.numBits = numBits;
    }

    void show(long val) {
        long mask = 1;

        // сдвинуть значение 1 влево на нужную позицию
        mask <<= numBits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.println("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
