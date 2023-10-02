import java.util.Scanner;
public class Hetchback {
    public void HetchbackInput()//create a method to take 1st input of car type "Hetchback"
    {
        int finalCharges = 0;
        System.out.println("How many services do you want to take?");
        System.out.println("For your car, we have a total of 5 services available as of now.");

        System.out.println("The list of services is given below:");
        System.out.println("1.Basic Servicing, Code:bs01, Charge:1000");
        System.out.println("2.Engine Fixing, Code:ef01, Charge:5000");
        System.out.println("3.Clutch Fixing, Code:cf01, Charge:2000");
        System.out.println("4.Brake Fixing, Code:bf01, Charge:1000");
        System.out.println("5.Gear Fixing, Code:gf01, Charge:1000");

        System.out.println("How many services do you want to take?");
        Scanner scn = new Scanner(System.in);
        int numberOfServices = scn.nextInt();
        System.out.println("Give me the name or the code of all" + numberOfServices + "services you want to take");
        String [] services = new String[numberOfServices];

        int totalAmount = 0;
        for(int i=0; i < numberOfServices; i++)
        {
            services[i] = scn.nextLine().toLowerCase();
            totalAmount += chargeForGivenService(services[i]);
        }
        System.out.println(totalAmount);
    }

    public static int chargeForGivenService(String typeOfService)
    {
        int charges = 0;
        if(typeOfService.equals("Basic Servicing") || typeOfService.equals("bs01"))
        {
            charges += 2000;
        }
        else if(typeOfService.equals("Engine Fixing") || typeOfService.equals("ef01"))
        {
            charges += 5000;
        }
        else if(typeOfService.equals("Clutch Fixing") || typeOfService.equals("cf01"))
        {
            charges += 2000;
        }
        else if(typeOfService.equals("Brake Fixing") || typeOfService.equals("bf01"))
        {
            charges += 1000;
        }
        else if(typeOfService.equals("Gear Fixing") || typeOfService.equals("gf01"))
        {
            charges += 1000;
        }
        else
        {
            System.out.println("As of now, we don't have" +typeOfService+ "for this type of car");
        }
        return charges;
    }
}
