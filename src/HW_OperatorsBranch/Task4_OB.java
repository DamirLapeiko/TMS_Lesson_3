package HW_OperatorsBranch;

import java.util.Scanner;

public class Task4_OB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу температуру на улице");
        int t = sc.nextInt();
        if (t > -5){
            System.out.println("Тепло");
        } else if ( -5 >= t || t > -20){
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
    }
}
