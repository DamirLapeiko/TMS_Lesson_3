import java.util.Scanner;

public class Practic1 {
        public static void main(String[] args) {
            System.out.println("Приветствую, Дамир, введите свой возраст для подтверждения авторизации");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age > 18 && age < 100){
                System.out.println("Вы авторизовались");
            } else if (age < 18) {
                System.out.println("Школьник, ты слишком мал для этой программы");
            } else if (age >= 100) {
                System.out.println("Вы стары для этой программы");
            }
        }
}
