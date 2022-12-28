package HW_Additional;

import java.util.Scanner;

public class Task4_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = sc.nextDouble();
        System.out.println("Enter month");
        int months = sc.nextInt();
        double payment = amount/months;
        double percentTotal = 0;
        for (int i = 0; i < months; i++){
            double percent = amount/100*7;
            System.out.println("Payment = " + payment + "percent = " + percent);
            amount -= payment;
            percentTotal += percent;
        }
        System.out.println("Total payment = " + percentTotal);
    }
}
