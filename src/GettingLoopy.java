//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GettingLoopy {
    public static void main(String[] args) {

        //A loop that counts up by 1 from 0 to 30
        /*
        for(int i = 1; i <= 30; i++)
        {
            System.out.println(+i);
        }
        */

        //A loop that counts down by 1 from 30 to 0
        /*
        for(int i = 30; i >= 1; i--)
        {
            System.out.println(+i);
        }
         */

        //A loop that counts up by 3 from 0 to 18
        /*
        for(int i = 0; i <= 18; i += 3)
        {
            System.out.println(+i);
        }
         */

        //A loop that counts down by 2 from 10 to 0
        /*
        for(int i = 10; i >= 0; i -= 2)
        {
            System.out.println(+i);
        }
         */

        // Task 5
        /*
        //Rows
        for(int row = 0; row < 6; row++)
        {
            //Columns
            for(int col = 0; col < row; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
         */

        //Task 6
        /*
        //Rows
        for(int row = 5; row > 0; row--)
        {
            //Columns
            for(int col = 0; col < row; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
         */

        //Task 7
        /*
        //Rows
        for(int row = 0; row < 5; row++)
        {
            System.out.print("*");
            //Columns
            for(int col = 0; col < 5; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
         */

        //Extra Credit
        //Rows
        for(int row = 1; row <= 8; row++)
        {
            //Columns
            for(int col = 1; col <= 8; col++)
            {
                //Check when to print *'s
                if(col == 1 || col == 8 || col==row)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}