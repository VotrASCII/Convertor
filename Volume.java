/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Volume
{   
         /**
         * member variables
         */
    private InputStreamReader ir;
    private BufferedReader br;

    /**
     * default constructor
     */
    public Volume()
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
        System.out.println("                !$    1. cubic cm                       $!");
        System.out.println("                !$    2. cubic meter                    $!");
        System.out.println("                !$    3. cubic feet                     $!");
        System.out.println("                !$    4. Gallon(UK)                     $!");
        System.out.println("                !$    5. Gallon(US)                     $!");
        System.out.println("                !$    6. cubic Inch                     $!");
        System.out.println("                !$    7. litres                         $!");
        System.out.println("                !$    8. cubic Yards                    $!");
        System.out.println("                !$    9.Back to Main Menu               $!");
        System.out.println("                !$. Enter your choice from 1 to 9       $!");
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
        System.out.println("                !$    1. cubic cm                     $!");
        System.out.println("                !$    2. cubic meter                  $!");
        System.out.println("                !$    3. cubic feet                   $!");
        System.out.println("                !$    4. Gallon(UK)                   $!");
        System.out.println("                !$    5. Gallon(US)                   $!");
        System.out.println("                !$    6. cubic Inch                   $!");
        System.out.println("                !$    7. litres                       $!");
        System.out.println("                !$    8. cubic Yards                  $!");
        System.out.println("                !$. Enter your choice from 1 to 8     $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }

    /**VolumeConvertor
    *
    *
    */
    public void mainVolumeConvertor()throws IOException
    {
        int frchoice, tochoice;
        double vol;
        String [ ]units= {" ","cubic cm","cubic meter","cubic feet","Gallon(UK)","Gallon(US)","cubic Inch"," litres","cubicYards"};
    
        do
        {
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=8)
            {
                System.out.println("Enter Volume of your choice in "+units[frchoice]);
                vol = Double.parseDouble(br.readLine());
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
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000001)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.00003532)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.00022)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000264)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.061024)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.001)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000001308)+units[tochoice]);
                                   break;
                    }
                                break;
                    case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*35.32)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*220)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*264)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*61024)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1000)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1.308)+units[tochoice]);
                                   break;
                    }
                                break;
                    case 3:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*28317)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.028317)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*6.228835)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*7.48052)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1728)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*28.317)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.037037)+units[tochoice]);
                                   break;
                    }
                                break;
                    case 4:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*4546)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.004546)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.160544)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1.20095)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*277.4194)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*4.546)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.005946)+units[tochoice]);
                                   break;
                    }
                                break;
                    case 5:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*3785)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.003785)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.133681)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.832674)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*231)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*3.785)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.004951)+units[tochoice]);
                                   break;
                    }
                                break;
                    case 6:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*16)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000016)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000579)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.003605)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.004329)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.016)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.000021)+units[tochoice]);
                                   break;
                    }
                                break;  
                    case 7:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.001)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.03532)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.22)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.264)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*61.024)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.001308)+units[tochoice]);
                                   break;
                    }                       
                                break;
                    case 8:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*764555)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*0.764555)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*27)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*168.178557)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*201.974026)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*46656)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*764.555)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Volume of"+(vol)+units[frchoice]+"="+(vol*1)+units[tochoice]);
                                   break;
                    }
                                break;                      
                    case 9: System.out.println("Back to Main Menu");                        
                                break;
                    default:System.out.println("INVALID OPTION");
            }
            System.out.println("Press any key to Continue Forward");
            String x=br.readLine();
        }while(frchoice!=9);
    }
}
