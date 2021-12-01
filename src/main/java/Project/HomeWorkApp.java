package Project;

public class HomeWorkApp {

  public static void main(String[] args){
      printThreeWords();
      checkSumSign();
      printColor();
      compareNumbers();
  }

      static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
     static void checkSumSign() {
         int a = -7;
         int b = 5;
         if (a + b >= 0) {
             System.out.println("Сумма положительная");
         }
         else if(a + b < 0){
             System.out.println("Сумма отрицательная");
         }
     }

     static void printColor() {
         int value = 101;
         if (value <= 0) {
             System.out.println("Красный");
         }
         else
             if (value > 0 && value <= 100) {
                 System.out.println("Желтый");
             }
                 else {
                     System.out.println("Зеленый");
         }
     }

   static void compareNumbers() {
      int a = -777;
      int b = 555;
      if (a > b){
          System.out.println("a >= b");
      }
          else {
              System.out.println("a < b");
              }
    }
}
