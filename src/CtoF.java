import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        //Input
        Scanner typeIn = new Scanner(System.in);
        Scanner tempIn = new Scanner(System.in);
        String trash;

        //Variables for type (C or F) and temp
        String type;
        double temp = 0;

        //C or F Input do while (bulletproofing)
        boolean typeDone = false;
        do
        {
            System.out.print("Is your temperature in C or F? ");
            //Converting to correct format and setting type variable
            type = typeIn.nextLine();
            type = type.toUpperCase();

            //Check if type is in the correct format
            if(type.equals("C") || type.equals("F"))
            {
                typeDone = true;

                //What temp do while input (bulletproofing)
                boolean tempDone = false;
                do
                {
                    System.out.print("What is your temperature? ");

                    //Check to make sure double is a double
                    if(tempIn.hasNextDouble())
                    {
                        //Set temp variable
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
