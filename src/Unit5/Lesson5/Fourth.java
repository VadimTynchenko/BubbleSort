package Unit5.Lesson5;

public class Fourth {
    public static void main(String[] args) {

        char[] nums = {'b', 's', 'g', 'a'}; //инициализация массива
        int a, b, t;
        int size = 4; // количество элементов массива

        //отобразить исходный массив
        System.out.println("Исходный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i] + " ");
        }
        System.out.println();

        // реализация пузырьковой сортировки
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // если требуемый порядок следования не соблюдается, поменять элементы местами
                    t = nums[b - 1]; // переменной t присваивается значение последнего элемента массива
                    nums[b - 1] = nums[b]; // предпоследний элемент приравнивается к последнему
                    nums[b] = (char) t; // последний элемент становится равен переменной t
                    // значения меняются местами
                }
            }
        }

        // отобразить сортированный массив
        for (char res : nums) {
            System.out.print(" " + res + " ");
        }
    }
}
