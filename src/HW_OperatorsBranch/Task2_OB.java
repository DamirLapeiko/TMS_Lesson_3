package HW_OperatorsBranch;

import java.util.Scanner;

public class Task2_OB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int input = sc.nextInt();
        if (input == 1){
            System.out.println("Зима");
        } else if (input == 2) {
            System.out.println("Весна");
        } else if (input == 3) {
            System.out.println("Лето");
        } else if (input == 4){
            System.out.println("Осень");
        } else if (input <= 0 || input > 5) {
            System.out.println("Неправильное число");
        }
    }
    }

