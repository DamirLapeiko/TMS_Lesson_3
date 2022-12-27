package HW_OperatorsBranch;

import java.util.Scanner;

public class Task3_OB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int input = sc.nextInt();
        for (int i = 0; true; i++) {
            if (input % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            return;
        }
    }
}