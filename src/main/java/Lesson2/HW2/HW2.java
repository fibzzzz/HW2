package Lesson2.HW2;

public class HW2 {
    public static void main(String[] args) {

        boolean a = within10and20(-100, 5);
        System.out.println(a);
        isPositiveOrNegative(0);
        boolean x = isNegative( -1);
        System.out.println(x);
        printWordNTimes("Hi", 5);
    }

    public static boolean within10and20(int a, int b) {
        int result = a + b;
        if (result <= 20 & result >= 10) {
            return true;
        } else
            return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " положительное число");
        } else {
            System.out.println(x + " отрицательное число");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
       else return false;
    }

    public static void printWordNTimes(String word, int times) {
        for ( int i = 0; i < times; i++ ) {
            System.out.println(word);
        }
    }

}
