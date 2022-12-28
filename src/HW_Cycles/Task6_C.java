package HW_Cycles;

import java.util.Scanner;

public class Task6_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (true) {
            input++;
            if (input % 5 == 0) {
                System.out.println(input);
                break;
            }
        }
    }
}
