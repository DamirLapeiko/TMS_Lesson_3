import java.util.Scanner;
//Цикл, в консоль пишешь число, и программа пишет простое это число или нет
public class Practic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = input; i <= input; i++) {
            if (input % 2 == 0) {
                System.out.println("Число не простое");
            } else {
                System.out.println("Число простое");
            }
        }
    }
}