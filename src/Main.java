public class Main {
    public static void main(String[] args) {

         int price= 125;
         double shipFee = price * 0.02;
         double finalPrice = price + shipFee;



         if ( price >= 100)
         {
         System.out.println("The shipping cost is " + shipFee + " and your total cost is " + finalPrice);
         } else
         {
          System.out.println("Yay shipping is free !");
         }

    }
}