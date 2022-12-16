import java.util.Scanner;

public class main {
    public  static String result = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        System.out.print("Введите минимальное значение массива: ");
        int min = in.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int max = in.nextInt();
        in.close();
        int[] array = program.createArray(size);
        array = program.array(array, min, max);
        String printArray = program.printArray(array);
        System.out.printf("Изначальный массив: " + printArray + "\n");
        program.mergeSort(array);
        System.out.printf("Отсортированный массив: " + result);
    }
}