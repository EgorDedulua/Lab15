import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания (1-2): ");
        int task = in.nextInt();
        Random rand = new Random();

        switch (task) {
            case 1:
                System.out.print("Введите количество элементов в массиве: ");
                int size = in.nextInt();
                int[] array = new int[size];
                for (int i = 0; i < size; ++i) {
                    //System.out.print("Введите элемент " + (i + 1) + ": ");
                    //   array[i] = in.nextInt();
                    array[i] = rand.nextInt(10);
                }
                int count = 0;
                for (int i = 0; i < size; i++) {
                    if (array[i] % 2 == 0)
                        ++count;
                }
                System.out.println("Количество четных элементов в массиве: " + count);
                break;
            case 2:
                int rows;
                do {
                    System.out.print("Введите количество строк в матрице (> 0): ");
                    rows = in.nextInt();
                } while (rows <= 0);

                int cols;
                do {
                    System.out.print("Введите количество столбцов в матрице (> 0): ");
                    cols = in.nextInt();
                } while (cols <= 0);

                int[][] matrix = new int[rows][cols];
                for (int i = 0; i < matrix.length; ++i) {
                    for (int j = 0; j < matrix[i].length; ++j) {
                        if (i == 0 || i == rows - 1
                                || j == 0 || j == cols - 1)
                            matrix[i][j] = 1;
                        else
                            matrix[i][j] = 0;
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Такого задания нет, повторите ввод");
        }
        in.close();
    }
}
