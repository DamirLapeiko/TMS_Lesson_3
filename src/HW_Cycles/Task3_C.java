package HW_Cycles;

public class Task3_C {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите целое положительное число");
//        int input = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= input; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//}
    public static void main(String[] args) {
        CalcWithTask3_C c = new CalcWithTask3_C();
        int sum = c.sumPositive(3);
        System.out.println(sum);
    }
}