package HW_Cycles;

public class Task7_C {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Номер элемента : " + i + ' ' + "Значение : " + array[i]);
        }
    }
}
