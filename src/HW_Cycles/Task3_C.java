package HW_Cycles;

import java.util.Scanner;

public class Task3_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
