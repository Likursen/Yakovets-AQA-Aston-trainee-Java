package yakovets.tasks;

import yakovets.utils.Utils;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        String expectedName = "Вячеслав";
        String actualName = Utils.scanString();
        if (actualName.equals(expectedName)) {
            System.out.println("Привет " + expectedName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}