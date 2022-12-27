package HW_Additional;

public class Task1_A {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 11; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
