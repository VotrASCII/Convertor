/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Convertor
{   
        /**
         * member variables
         */
        private InputStreamReader ir;
        private BufferedReader br;
        
        /**
         * default constructor
         */
     public Convertor()
        {
             ir=new InputStreamReader(System.in);
             br=new BufferedReader(ir);
        }

    /**display Main Menu
    *
    *
    */
     public void displayMainMenu()
        {
                System.out.println("\f");
                System.out.println("                !$$$$$$$$$$$$        #MAIN MENU#     $$$$$$$$$$$$!");
                System.out.println("                !$    1.Length                                  $!");
                System.out.println("                !$    2.Mass                                    $!");
                System.out.println("                !$    3.Temperature                             $!");
                System.out.println("                !$    4.Time                                    $!");
                System.out.println("                !$    5.Area                                    $!");
                System.out.println("                !$    6.Volume                                  $!");
                System.out.println("                !$    7.Angle                                   $!");
                System.out.println("                !$    8.Exit                                    $!");
                System.out.println("                !$.  Enter your choice from 1 to 8              $!");
                System.out.println("                !$$$$$$$$$$$$       #MAIN MENU#      $$$$$$$$$$$$!");
        }
        
     public void mainConvertor()throws IOException
        {
        int choice;       
        do
        {
            displayMainMenu();
            System.out.println("Enter Number of your choice");
            choice=Integer.parseInt(br.readLine());
            if(choice>=1 && choice<=8)
            {
                switch(choice)
                {
                    case 1:Length l1=new Length();
                        l1.mainLengthConvertor();
                        break;
                    case 2: Mass m1= new Mass();
                        m1.mainMassConvertor();
                        break;  
                    case 3: Temperature t1= new Temperature();
                        t1.mainTemperatureConvertor();
                        break;  
                    case 4: Time ti1= new Time();
                        ti1.mainTimeConvertor();
                        break;  
                    case 5: Area ar1= new Area();
                        ar1.mainAreaConvertor();
                        break;  
                    case 6: Volume  v1= new Volume ();
                        v1.mainVolumeConvertor();
                        break; 
                    case 7: Angle a1= new Angle();
                        a1.mainAngleConvertor();
                        break;
                    case 8: System.out.println("TERMINATING: Thank You");
                         break;
                    default: System.out.println("INVALID OPTION");  
                }
            }
            else
            {
                 System.out.println("Self-Destruction Mode Enabled: RETRY from Beginning");
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println("By: MAYANK PRAKASH");
                 System.out.println("Std. 10 'D'");
                 System.out.println("St.Joseph's School, Bhagalpur");
                 System.out.println("ICSE 2011-2012"); 
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println(" ");
                 for(int j=10; j>=1;j--)
                 {
                      System.out.print(j+"\t");
                      for(long i=1;i<=99900*10000;i++);
                 }
                 break;
            }
        }while(choice!=8);
    }
}
