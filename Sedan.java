import java.util.Scanner;
public class Sedan {
    public void SedanInput()//create a method to take 1st input of car type "Sedan"
    {
        int finalCharges = 0;
        System.out.println("How many services do you want to take?");
        System.out.println("For your car, we have a total of 5 services available as of now.");

        System.out.println("The list of services is given below:");
        System.out.println("1.Basic Servicing, Code:bs02, Charge:4000");
        System.out.println("2.Engine Fixing, Code:ef02, Charge:8000");
        System.out.println("3.Clutch Fixing, Code:cf02, Charge:4000");
        System.out.println("4.Brake Fixing, Code:bf02, Charge:1500");
        System.out.println("5.Gear Fixing, Code:gf02, Charge:6000");

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
        if(typeOfService.equals("Basic Servicing") || typeOfService.equals("bs02"))
        {
            charges += 4000;
        }
        else if(typeOfService.equals("Engine Fixing") || typeOfService.equals("ef02"))
        {
            charges += 8000;
        }
        else if(typeOfService.equals("Clutch Fixing") || typeOfService.equals("cf02"))
        {
            charges += 4000;
        }
        else if(typeOfService.equals("Brake Fixing") || typeOfService.equals("bf02"))
        {
            charges += 1500;
        }
        else if(typeOfService.equals("Gear Fixing") || typeOfService.equals("gf02"))
        {
            charges += 6000;
        }
        else
        {
            System.out.println("As of now, we don't have" +typeOfService+ "for this type of car");
        }
        return charges;
    }
}
