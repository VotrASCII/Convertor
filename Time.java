/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Time
{   
         /**
         * member variables
         */
     private InputStreamReader ir;
      private BufferedReader br;

     /**
     * default constructor
     */
        public Time()
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
              System.out.println("  The Values are Approximate for this conversion: Don't consider this as a Standard Value");
              System.out.println("              !$$$$$$$$$$$    #FROM MENU#     $$$$$$$$$$$!");
              System.out.println("              !$      1.Second                         .$!");
              System.out.println("              !$      2.Minute                         .$!");
              System.out.println("              !$      3.Hour                           .$!");
              System.out.println("              !$      4.Days                           .$!");
              System.out.println("              !$      5.Week                           .$!");
              System.out.println("              !$      6.Month                          .$!");
              System.out.println("              !$      7.Year                           .$!");
              System.out.println("              !$      8.Back to Main Menu              .$!");
              System.out.println("              !$  .Enter your choice from 1 to 8       .$!");
              System.out.println("              !$$$$$$$$$$$    #FROM MENU#     $$$$$$$$$$$!");
        }
        
    /**display To Menu
    *
    *
    */
        public void displaySubMenuTo()
        {
            System.out.println("\f");
            System.out.println("                !$$$$$$$$$$$$   #TO MENU#   $$$$$$$$$$$$!");
            System.out.println("                !$      1.Second                      .$!");
            System.out.println("                !$      2.Minute                      .$!");
            System.out.println("                !$      3.Hour                        .$!");
            System.out.println("                !$      4.Days                        .$!");
            System.out.println("                !$      5.Week                        .$!");
            System.out.println("                !$      6.Month                       .$!");
            System.out.println("                !$      7.Year                        .$!");
            System.out.println("                !$  .Enter your choice from 1 to 7    .$!");
            System.out.println("                !$$$$$$$$$$$$   #TO MENU#   $$$$$$$$$$$$!");
        }
        
    /** Time Convertor
    *
    *
    */
        public void mainTimeConvertor()throws IOException
        {
                int frchoice, tochoice;
                double time;
                String [ ]units= {" ","Second","Minute","Hour","Days","Week","Month","Year"};
                do
                {
                        displaySubMenuFrom();
                        frchoice = Integer.parseInt(br.readLine());
                        if(frchoice>=1&& frchoice<=7)
                        {
                                System.out.println("Enter Time of your choice in "+units[frchoice]);
                                time = Double.parseDouble(br.readLine());
                                displaySubMenuTo();
                                tochoice = Integer.parseInt(br.readLine());
                        }
                        else
                        {
                                System.out.println("Self-Destruction Mode Enabled: RETRY from Beginning");
                                for(int i=10;i>=1;i--)
                                {
                                    System.out.print(i+"\t");
                                    for(long j=1;j<=99900*10000;j++);
                                }
                                break ;
                        }
                        switch(frchoice)
                        {
                                case 1:
                                switch(tochoice)
                                {
                                        case 1: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/60)+units[tochoice]);
                                                         break;
                                     case 3: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*60))+units[tochoice]);
                                                         break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*60*24))+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*60*24*7))+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*60*24*30))+units[tochoice]);
                                                    break; 
                                        case 7: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*60*24*30*12))+units[tochoice]);
                                                        break;             
                                }
                                    break;
                                case 2:
                                 switch(tochoice)
                                {
                                        case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60)+units[tochoice]);
                                                     break;
                                    case 2: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60))+units[tochoice]);
                                                        break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*24))+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*24*7))+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*24*7*30))+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(60*24*7*30*12))+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 3:
                                switch(tochoice)
                                {
                                        case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*60)+units[tochoice]);
                                                        break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/24)+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(24*7))+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(24*30))+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(24*30*12))+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 4:
                                switch(tochoice)
                                {
                                        case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*60*24)+units[tochoice]);
                                                    break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*24)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println((("Time of"+(time)+units[frchoice]+"="+(time)*24))+units[tochoice]);
                                                        break;
                                        case 4: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/7)+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/30)+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/(30*12))+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 5:
                                switch(tochoice)
                                {
                                        case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*60*24*7)+units[tochoice]);
                                                        break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*24*7)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println((("Time of"+(time)+units[frchoice]+"="+(time)*24*7))+units[tochoice]);
                                                        break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*7)+units[tochoice]);
                                                        break;
                                        case 5: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/4)+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)/52)+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 6:
                                switch(tochoice)
                                {
                                    case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*60*24*30)+units[tochoice]);
                                                        break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*24*30)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println((("Time of"+(time)+units[frchoice]+"="+(time)*24*30))+units[tochoice]);
                                                        break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*30)+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*4)+units[tochoice]);
                                                        break;
                                        case 6: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println((("Time of"+(time)+units[frchoice]+"="+(time)/12))+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 7:
                                switch(tochoice)
                                {
                                        case 1: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*60*24*30*12)+units[tochoice]);
                                                        break;
                                        case 2: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*60*24*30*12)+units[tochoice]);
                                                        break;
                                        case 3: System.out.println((("Time of"+(time)+units[frchoice]+"="+(time)*24*30*12))+units[tochoice]);
                                                        break;
                                        case 4: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*365)+units[tochoice]);
                                                        break;
                                        case 5: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*52)+units[tochoice]);
                                                        break;
                                        case 6: System.out.println(("Time of"+(time)+units[frchoice]+"="+(time)*12)+units[tochoice]);
                                                        break; 
                                        case 7: System.out.println("Time of"+(time)+units[frchoice]+"="+(time)+units[tochoice]);
                                                        break; 
                                }
                                    break;
                                case 8: System.out.println("Back to Main Menu");                       
                                        break;
                                default:System.out.println("INVALID OPTION");
                        }
                        System.out.println("Press any key to Continue Forward");
                        String x=br.readLine();
                }while(frchoice!=8);
        }
}
