/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Length
{   
    /**
     * member variables
     */
    private InputStreamReader ir;
    private BufferedReader br;

    /**
     * default constructor
     */
    public Length()
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
        System.out.println("                !$      1.mm                            $!");
        System.out.println("                !$      2.cm                            $!");
        System.out.println("                !$      3.m                             $!");
        System.out.println("                !$      4.Km                            $!");
        System.out.println("                !$      5.Feet(Int)                     $!");
        System.out.println("                !$      6.Feet(USA)                     $!");
        System.out.println("                !$      7.Inch                          $!");
        System.out.println("                !$      8.Miles                         $!");
        System.out.println("                !$      9.Nauticle Miles                $!");
        System.out.println("                !$      10.Yards                        $!");
        System.out.println("                !$      11.Back To Main Menu            $!");
        System.out.println("                !$.     Enter your choice from 1 to 11  $!");
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
        System.out.println("                !$      1.mm                          $!");
        System.out.println("                !$      2.cm                          $!");
        System.out.println("                !$      3.m                           $!");
        System.out.println("                !$      4.Km                          $!");
        System.out.println("                !$      5.Feet(Int)                   $!");
        System.out.println("                !$      6.Feet(USA)                   $!");
        System.out.println("                !$      7.Inch                        $!");
        System.out.println("                !$      8.Miles                       $!");
        System.out.println("                !$      9.Nauticle Miles              $!");
        System.out.println("                !$      10.Yards                      $!");
        System.out.println("                !$.  Enter your choice from 1 to 9.   $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }

    /**display From Menu
    *
    *
    */
    public void mainLengthConvertor()throws IOException
    {
        int frchoice, tochoice;
        double len;
        String [ ]units= {" ","mm","cm","Meter","Km","Feet(Ind)","Feet(USA)","Inch","Miles","Nauticle Miles","Yards"};
        do
        {
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=10)
            {
                System.out.println("Enter Length of your choice in "+units[frchoice]);
                len = Double.parseDouble(br.readLine());
                displaySubMenuTo();
                tochoice = Integer.parseInt(br.readLine());
            }
            else
            {
                System.out.println("Self-Destruction Mode Enabled: RETRY from Beginning");
                for(int j=10; j>=1;j--)
                {
                    System.out.print(j+"\t");
                    for(long i=1;i<=99900*10000;i++);
                }
                break;
            }
            switch(frchoice)
            {
                case 1:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.1)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.001)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0032808399)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0032808333)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0393707)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00000062)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00000054)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.001094)+units[tochoice]);
                                    break;
                    }
                        break;
                case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*10)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.01)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.032808399)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.032808333)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.393707)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0000062)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0000054)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.01094)+units[tochoice]);
                                    break;
                    }
                        break;
                case 3:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*100)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.001)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*3.2808399)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*3.2808333)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*39.3707)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00062)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00054)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1.094)+units[tochoice]);
                                    break;
                    }
                        break;
                case 4:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*100000)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1000)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*3280.8399)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*3280.8333)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*39370.7)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.62)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.54)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1094)+units[tochoice]);
                                    break;
                    }
                        break;
                case 5:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*304.8)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*30.48)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.3048)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0003048)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.999998)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*12)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000189)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000165)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.33333)+units[tochoice]);
                                    break;
                    }
                        break;
                case 6:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*304.801)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*30.4801)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.304801)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000304801)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1.000002)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*12.000024)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00018908)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.00016508)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.333334)+units[tochoice]);
                                    break;
                    }
                        break;  
                case 7:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*25.4)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*2.54)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0254)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0000254)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.083333)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0833331)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000016)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000014)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.027778)+units[tochoice]);
                                    break;
                    }                       
                        break;
                case 8:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1609344)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*160934.4)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1609.344)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1.609344)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*5280)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*5279.98944)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*63360)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.868961)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1760)+units[tochoice]);
                                    break;
                    }
                        break;                      
                case 9:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1852000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*185200)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1852)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1.852)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*6076.115495)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*6076.103333)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*72913.386308)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1.1508)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*2025.371832)+units[tochoice]);
                                    break;
                    }
                        break;                      
                case 10:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*914.4)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*91.44)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.9144)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.0009144)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*3)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*2.999994)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*36)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000568)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*0.000494)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Length of"+(len)+units[frchoice]+"="+(len*1)+units[tochoice]);
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