package yakovets.tasks;

import yakovets.utils.Utils;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = Utils.scanInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}