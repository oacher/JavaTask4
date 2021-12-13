/* Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
целому числу X. В результате должен получиться массив не большей размерности. На экран должны
выводиться как оригинальное состояние массива, так и итоговое. */
import java.util.Scanner;
public class JavaTask4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int x ;
        int arraysize = 0;
        int i = 0;
        System.out.print("Введите количество элементов: ");
        int n = in.nextInt();
        arraysize = n;
        int[] array = new int[n];
        for ( i = 0; i < n; i++){
            System.out.print("Введите элемент: ");
            array[i] = in.nextInt();
        }

        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");

        System.out.print("Введите число х, чтобы убрать лишние элементы массива: ");
        x = in.nextInt();
        for (i = 0; i < arraysize; i++)    {
            if (array[i] == x)
                break;
        }
        for (int k = i; k < arraysize - 1; k++)
            array[k] = array[k + 1];
        arraysize--;

        for (i = 0; i < arraysize; i++)
            System.out.print(array[i] + " ");
        System.out.println("");

        in.close();
    }
}

