package org.example;

import org.example.db.InsertTable;
import java.util.Scanner;

public class ArrayPI {
    protected int[] array;

    public ArrayPI() {
        Scanner scanner = new Scanner(System.in);

        int size;
        while (true) {
            System.out.print("Введите количество чисел для ввода: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Число должно быть положительным.");
                }
            } else {
                System.out.println("Ошибка: Введите целое число.");
                scanner.next();
            }
        }

        array = new int[size];
        System.out.println("Введите " + size + " целых чисел:");

        for (int i = 0; i < size; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка: Введите целое число.");
                    scanner.next();
                }
            }
        }
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void saveToDatabase(String tableName) {
        InsertTable insertTable = new InsertTable();
        insertTable.insertNumbers(tableName, array);
    }
}
