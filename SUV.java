import java.util.Scanner;
public class SUV{
    public void SUVInput()//create a method to take 1st input of car type "Hetchback"
    {
        int finalCharges = 0;
        System.out.println("How many services do you want to take?");
        System.out.println("For your car, we have a total of 5 services available as of now.");

        System.out.println("The list of services is given below:");
        System.out.println("1.Basic Servicing, Code:bs03, Charge:5000");
        System.out.println("2.Engine Fixing, Code:ef03, Charge:10000");
        System.out.println("3.Clutch Fixing, Code:cf03, Charge:6000");
        System.out.println("4.Brake Fixing, Code:bf03, Charge:2500");
        System.out.println("5.Gear Fixing, Code:gf03, Charge:8000");

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
        if(typeOfService.equals("Basic Servicing") || typeOfService.equals("bs03"))
        {
            charges += 5000;
        }
        else if(typeOfService.equals("Engine Fixing") || typeOfService.equals("ef03"))
        {
            charges += 10000;
        }
        else if(typeOfService.equals("Clutch Fixing") || typeOfService.equals("cf03"))
        {
            charges += 6000;
        }
        else if(typeOfService.equals("Brake Fixing") || typeOfService.equals("bf03"))
        {
            charges += 2500;
        }
        else if(typeOfService.equals("Gear Fixing") || typeOfService.equals("gf03"))
        {
            charges += 8000;
        }
        else
        {
            System.out.println("As of now, we don't have" +typeOfService+ "for this type of car");
        }
        return charges;
    }
}
