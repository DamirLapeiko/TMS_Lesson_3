import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверное число");
        }
    }
}
