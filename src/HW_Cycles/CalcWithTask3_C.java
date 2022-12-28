package HW_Cycles;
import java.util.Scanner;
public class CalcWithTask3_C {
    public int sumPositive(int i) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int j = 0; j <= number; j++){
            sum = sum + j;
        }
        return sum;
    }
}
