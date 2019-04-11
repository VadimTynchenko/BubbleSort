package Unit8.ExtendsOfInterface;

// Этот клас должен реализовывать все методы,
// объявленные в интерфейсах А и В
public class MyClass implements B{
    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }

    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }
}
