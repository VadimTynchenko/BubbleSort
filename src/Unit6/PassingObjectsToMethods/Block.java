package Unit6.PassingObjectsToMethods;

class Block {
    private int a, b, c;
    private int volume;

    Block(int i, int j,  int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Вернуть логическое значение true, если
    // параметр ob определяет тот же параллелепипед
    boolean sameBlock(Block ob) {
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }

    // Вернуть логическое значение true, если
    // параметр ob определяет параллелепипед того же объема
    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 =  new Block(4, 5,5);

        System.out.println("ob1 имеет те же размеры, что и блок ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 имеет те же размеры, что и блок ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 имеет тот же объем, что и блок ob3: " + ob1.sameVolume(ob3));
    }
}
