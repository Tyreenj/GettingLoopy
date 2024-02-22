import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        //Input
        Scanner typeIn = new Scanner(System.in);
        Scanner tempIn = new Scanner(System.in);
        String trash;

        String type;
        double temp = 0;

        //C or F Input do while (bulletproofing)
        boolean typeDone = false;
        do
        {
            System.out.print("Is your temperature in C or F? ");
            type = typeIn.nextLine();
            type = type.toUpperCase();

            if(type.equals("C") || type.equals("F"))
            {
                typeDone = true;

                //What temp do while input (bulletproofing)
                boolean tempDone = false;
                do
                {
                    System.out.print("What is your temperature? ");

                    if(tempIn.hasNextDouble())
                    {
                        temp = tempIn.nextDouble();
                        tempDone = true;
                    } else //Invalid temp catcher
                    {
                        trash = tempIn.nextLine();
                        System.out.print("That is not a valid temperature! " +trash);
                    }

                } while(!tempDone);

            } else // Invalid type catcher
            {
                System.out.println("That is not a valid temperature type! " +type);
            }
        } while(!typeDone);

        // Maths for converting temperatures
        if(type.equals("F"))
        {
            temp = (temp - 32) * 5 / 9;
            System.out.println("Your temperature is "+temp +" degrees Celsius");
        } else {
            temp = (temp * 9 / 5) + 32;
            System.out.println("Your temperature is "+temp +" degrees Fahreneheit!");
        }
    }
}
