/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Mass
{   
           /**
         * member variables
         */
    private InputStreamReader ir;
    private BufferedReader br;

    /**
     * default constructor
     */
    public Mass()
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
        System.out.println("                !$    1.mg                              $!");
        System.out.println("                !$    2.g                               $!");
        System.out.println("                !$    3.Kg                              $!");
        System.out.println("                !$    4.Tonne                           $!");
        System.out.println("                !$    5.Ton(UK)                         $!");
        System.out.println("                !$    6.Tons(US)                        $!");
        System.out.println("                !$    7.Grain                           $!");
        System.out.println("                !$    8.Ounces                          $!");
        System.out.println("                !$    9.Pounds                          $!");
        System.out.println("                !$    10.Stones                         $!");
        System.out.println("                !$    11.Back to Main Menu              $!");
        System.out.println("                !$.  Enter your choice from 1 to 11     $!");
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
        System.out.println("                !$    1.mg                            $!");
        System.out.println("                !$    2.g                             $!");
        System.out.println("                !$    3.Kg                            $!");
        System.out.println("                !$    4.Tonne                         $!");
        System.out.println("                !$    5.Ton(UK)                       $!");
        System.out.println("                !$    6.Tons(US)                      $!");
        System.out.println("                !$    7.Grain                         $!");
        System.out.println("                !$    8.Ounces                        $!");
        System.out.println("                !$    9.Pounds                        $!");
        System.out.println("                !$    10.Stones                       $!");
        System.out.println("                !$.  Enter your choice from 1 to 11   $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }

    /**MassConvertor
    *
    *
    */
    public void mainMassConvertor()throws IOException
    {
        int frchoice, tochoice;
        double mass;
        String [ ]units= {" ","mg","g","Kg","Tonne","Ton(UK)","Tons(US)","Grain","Ounces","Pounds","Stones"};
        do
        {    
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=10)
            {
                System.out.println("Enter Mass/Weight of your choice in "+units[frchoice]);
                mass = Double.parseDouble(br.readLine());
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
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.001)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000001)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00000000098421)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0000000011023)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.015432358)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000035273966)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000002204623)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000157473)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.001)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00000098421)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0000011023)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*15.432358)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.035273966)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.002204623)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000157473)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 3:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00098421)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0011023)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*15432.358)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*35.273966)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*2.204623)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.157473)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 4:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000000)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1000)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.98421)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1.1023)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*15432358)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*35273.966)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*2204.623)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*157.473)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 5:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*10166046908.8)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*10166046.9088)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1016.60469088)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1.01660469088)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1.12)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*15680000)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*35840)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*2240)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*160)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 6:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*907184740)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*907184.74)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*907.18474)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.90718474)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.8928571428571)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*14000000)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*32000)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*2000)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*142.85714285714)+units[tochoice]);
                                    break;
                    }  
                        break;
                    case 7:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*64.891)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.064891)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000064891)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000064891)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000062776)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000071429)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.002285714)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000142857)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0000102041)+units[tochoice]);
                                    break;
                    }                       
                        break;
                    case 8:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*28349.52)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*28.34952)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.02834952)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00002834952)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.000000000279)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00003125)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*437.5)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0625)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.004464286)+units[tochoice]);
                                    break;
                    }   
                        break;
                    case 9:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*453592.37)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*453.59237)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.45359237)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00045359237)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00044643)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.0005)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*7000)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*16)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.071428571)+units[tochoice]);
                                    break;
                    }   
                        break;
                    case 10:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*6350293.18)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*6350.29318)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*6.35029318)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00635029318)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.00625)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*0.007)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*98000)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*224)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*14)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Mass of"+(mass)+units[frchoice]+"="+(mass*1)+units[tochoice]);
                                    break;
                    }   
                    break;
                    case 11: System.out.println("Back to Main Menu");                      
                             break;
                    default:System.out.println("INVALID OPTION");
            }
            System.out.println("Press any key to Continue Forward");
            String x=br.readLine();
        }while(frchoice!=11);
    }
}
