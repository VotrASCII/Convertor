/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Temperature
{   
         /**
         * member variables
         */
    private InputStreamReader ir;
    private BufferedReader br;

    /**
     * default constructor
     */
    public Temperature()
    {
        ir=new InputStreamReader(System.in);
        br=new BufferedReader(ir);
    }

    /**display From Menu
    *
    *
    */
    public void displaySubMenuFrom()
    {
        System.out.println("\f");
        System.out.println("                !$$$$$$$$$$$$   #FROM MENU#  $$$$$$$$$$$$!");
        System.out.println("                !$    1.Fahrenheit                      $!");
        System.out.println("                !$    2.Celsius                         $!");
        System.out.println("                !$    3.Kelvin                          $!");
        System.out.println("                !$    4.Back to Main Menu               $!");
        System.out.println("                !$. Enter your choice from 1 to 4       $!");
        System.out.println("                !$$$$$$$$$$$$   #FROM MENU#  $$$$$$$$$$$$!");
    }
    
    /**display To Menu
    *
    *
    */
    public void displaySubMenuTo()
    {  
        System.out.println("\f");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
        System.out.println("                !$    1.Fahrenheit                    $!");
        System.out.println("                !$    2.Celsius                       $!");
        System.out.println("                !$    3.Kelvin                        $!");
        System.out.println("                !$. Enter your choice from 1 to 3     $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }
    
    /**Temperature Convertor
    *
    *
    */
    public void mainTemperatureConvertor()throws IOException
    {
        int frchoice, tochoice;
        double temp;
        String [ ]units= {" ","Fahrenheit","Celsius","Kelvin"};
        do
        {
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=3)
            {
                System.out.println("Enter Temperature of your choice in "+units[frchoice]);
                temp = Double.parseDouble(br.readLine());
                displaySubMenuTo();
                tochoice = Integer.parseInt(br.readLine());
            }
            else
            {
                System.out.println("Self-Destruction Mode Enabled: RETRY from Beginning");
                for(int j=10; j>=1;j--)
                {
                    System.out.print(j+"\t");
                    for(int i=1; i<=99900*10000;i++);
                }
                break;
            }
            switch(frchoice)
            {
                case 1:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+temp+units[tochoice]);
                                    break;
                        case 2: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+((temp-32)/1.8)+units[tochoice]);
                                     break;
                        case 3: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+((temp-32)/1.8+273)+units[tochoice]);
                                     break;
                    }
                    break;
                case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+((temp*1.8)+32)+units[tochoice]);
                                    break;
                        case 2: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+temp+units[tochoice]);
                                     break;
                        case 3: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+(temp+273)+units[tochoice]);
                                     break;
                    }
                    break;
                case 3:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+((temp-273)*1.8+32)+units[tochoice]);
                                    break;
                        case 2: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+(temp-273)+units[tochoice]);
                                     break;
                        case 3: System.out.println("Temperature of"+(temp)+units[frchoice]+"="+(temp)+units[tochoice]);
                                     break;
                    }
                    break;
                case 4: System.out.println("Back to Main Menu");                         
                           break;
                default:System.out.println("INVALID OPTION");
            }
            System.out.println("Press any key to Continue Forward");
            String x=br.readLine();
        }while(frchoice!=4);
    }
}
