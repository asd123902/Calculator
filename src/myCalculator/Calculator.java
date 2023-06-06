package myCalculator;

import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int numberOne = scanner.nextInt();


        System.out.print("Введите второе число: ");
        int numberTwo = scanner.nextInt();


        System.out.print("Выберите операцию (+, -, *, /): ");
        String operator = scanner.next();

        double result = 0;

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("Такой операции нет");
                return;


            }
        System.out.println("Результат: " + result);

        }

    }

