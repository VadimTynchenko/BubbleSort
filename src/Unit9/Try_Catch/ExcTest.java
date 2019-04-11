package Unit9.Try_Catch;

//Исключени может быть сгенерированно одним методом,
//а перехвачено другим.
public class ExcTest {
    // Генераци исключения
    static void genException() {
        int[] nums = new int[4];

        System.out.println("До генерации исключения.");

        // Сгенерировать исключение в связи с
        // выходом за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет выполняться!");
    }
}
