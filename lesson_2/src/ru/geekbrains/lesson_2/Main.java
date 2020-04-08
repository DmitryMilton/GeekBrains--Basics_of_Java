package ru.geekbrains.lesson_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите операцию: ");
        System.out.println("1: сложение");
        System.out.println("2: вычитание");
        System.out.println("3: Умножение");
        System.out.println("4: Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int result;
        if(operation == 1){
            result = a + b;
        } else if(operation == 2) {
            result = a- b;
        } else if(operation == 3) {
            result = a * b;
        } else if(operation == 4) {
            result = a / b;
        } else {
            System.out.println("Вы ввели некорректное значение.");
            result = 0;
        }
        System.out.println("Результат = " + result);
    }
}
