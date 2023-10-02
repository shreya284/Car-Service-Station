import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("Welcome to Pappu's Car Servicing Station");
         System.out.println("As of now, we have services for 3 types of cars: 1.Hetchback\n 2.Sedan\n 3.SUV");
         //Take the carType input from the user
         System.out.println("What type of car do you have:");
         String carType = scn.nextLine();
         carType = carType.toLowerCase();

         if(carType.equals("hetchback"))
         {
              Hetchback t1 = new Hetchback();//create an object reference for car type "hetchback"
              t1.HetchbackInput();
         }
         else if(carType.equals("sedan"))
         {
              Sedan t2 = new Sedan();//create an object reference for car type "hetchback"
              t2.SedanInput();
         }
         else if(carType.equals("suv"))
         {
              SUV t3 = new SUV();//create an object reference for car type "hetchback"
              t3.SUVInput();
         }
         else
         {
              System.out.println("As of now, we don't have services for this type of car");
         }
    }
}