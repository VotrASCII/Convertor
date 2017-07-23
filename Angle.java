/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Angle
{   
        /**
         * member variables
         */
    private InputStreamReader ir;
    private BufferedReader br;

    /**
     * default Constructor
     */
    public Angle()
    {
        ir=new InputStreamReader(System.in);
        br=new BufferedReader(ir);
    }

    /**
     * display From Menu
    */
    public void displaySubMenuFrom()
    {
        System.out.println("\f");
        System.out.println("                !$$$$$$$$$$$$   #FROM MENU#  $$$$$$$$$$$$!");
        System.out.println("                !$      1. Degrees                      $!");
        System.out.println("                !$      2. Radians                      $!");
        System.out.println("                !$      3. Back to Main Menu            $!");
        System.out.println("                !$.   Enter your choice from 1 to 3     $!");
        System.out.println("                !$$$$$$$$$$$$   #FROM MENU#  $$$$$$$$$$$$!");
    }
    
    /**
     * display To Menu
    */
    public void displaySubMenuTo()
    {
        System.out.println("\f");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
        System.out.println("                !$      1. Degrees                    $!");
        System.out.println("                !$      2. Radians                    $!");
        System.out.println("                !$.   Enter your choice between 1 / 2 $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }

    /**
    *Angle Convertor
    */    
    public void mainAngleConvertor()throws IOException
    {
        int frchoice, tochoice;
        double angle;
        String [ ]units= {" ","Degrees","Radians"};
        do
        {
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=2)
            {
                System.out.println("Enter Angle of your choice in "+units[frchoice]);
                angle = Double.parseDouble(br.readLine());
                displaySubMenuTo();
                tochoice = Integer.parseInt(br.readLine());
            }
            else
            {
                System.out.println("Self-Destruction Mode Enabled: RETRY from Beginning");
                for(int j=10; j>=1;j--)
                {
                    System.out.print(j+"\t");
                    for(int i=1;i<=99900*10000;i++);
                }
                break;
            }
            switch(frchoice)
            {
                case 1:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Angle of"+(angle)+units[frchoice]+"="+(angle*1)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Angle of"+(angle)+units[frchoice]+"="+(angle*22/7)/(90*2)+units[tochoice]);
                                   break;
                    }
                    break;
                case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Angle of"+(angle)+units[frchoice]+"="+(2*angle*90.0)/(22.0/7)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Angle of"+(angle)+units[frchoice]+"="+(angle*1)+units[tochoice]);
                                   break;
                    }
                    break;
                case 3: System.out.println("Back to Main Menu");                       
                           break;
                default:System.out.println("INVALID OPTION");
            }
            System.out.println("Press any key to Continue Forward");
            String x=br.readLine();
        }while(frchoice!=3);
    }
}