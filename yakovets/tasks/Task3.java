package yakovets.tasks;

import yakovets.utils.Utils;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int arraySize = 5;
        int commonMultiply = 3;
        System.out.println("Введите числа " + arraySize + " шт. (построчно)");
        int[] array = Utils.createAndFillArray(arraySize);
        System.out.println("Числа кратные: " + commonMultiply);
        Arrays.stream(array)
                .filter(i -> i % commonMultiply == 0)
                .forEach(System.out::println);
    }
}