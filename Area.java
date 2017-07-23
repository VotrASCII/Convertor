/**
 * Mayank Prakash
 * Std. 10'D'
 * Roll no. 19
 */
import java.io.*;
class Area
{   
         /**
         * member variables
         */
    private InputStreamReader ir;
    private BufferedReader br;

     /**
     * default constructor
     */
    public Area()
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
        System.out.println("                !$      1. sq.cm                        $!");
        System.out.println("                !$      2. sq.meter                     $!");
        System.out.println("                !$      3. Acre                         $!");
        System.out.println("                !$      4. sq. feet                     $!");
        System.out.println("                !$      5. Hectare                      $!");
        System.out.println("                !$      6. sq.Inch                      $!");
        System.out.println("                !$      7. sq. Miles                    $!");
        System.out.println("                !$      8. sq.Yards                     $!");
        System.out.println("                !$      9. Are                          $!");
        System.out.println("                !$      10.Back to Main Menu            $!");
        System.out.println("                !$.   Enter your choice from 1 to 10    $!");
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
        System.out.println("                !$      1. sq.cm                      $!");
        System.out.println("                !$      2. sq.meter                   $!");
        System.out.println("                !$      3. Acre                       $!");
        System.out.println("                !$      4. sq. feet                   $!");
        System.out.println("                !$      5. Hectare                    $!");
        System.out.println("                !$      6. sq.Inch                    $!");
        System.out.println("                !$      7. sq. Miles                  $!");
        System.out.println("                !$      8. sq.Yards                   $!");
        System.out.println("                !$      9. Are                        $!");
        System.out.println("                !$.   Enter your choice from 1 to 9   $!");
        System.out.println("                !$$$$$$$$$$$$   #TO MENU#  $$$$$$$$$$$$!");
    }

    /**display AreaConvertor
    *
    *
    */    
    public void mainAreaConvertor()throws IOException
    {
        int frchoice, tochoice;
        double ar;
        String [ ]units= {" ","sq.cm","sq.meter","Acre","sq. feet","Hectare","sq.Inch"," sq. Miles","sq.Yards","Are"};
        do
        {
            displaySubMenuFrom();
            frchoice = Integer.parseInt(br.readLine());
            if(frchoice>=1&& frchoice<=9)
            {
                System.out.println("Enter Area of your choice in "+units[frchoice]);
                ar = Double.parseDouble(br.readLine());
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
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0001)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000000024711)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0010764)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00000001)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.155)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000000000039)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0001196)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000001)+units[tochoice]);
                                    break;
                    }
                        break;
                    case 2:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*10000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00024711)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*10.764)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0001)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1550)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00000039)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1.196)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.01)+units[tochoice]);
                                   break;
                    }
                        break;
                    case 3:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*40468730)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*4046.873)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*43560)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.4046873)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*6272640)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0015625)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*4840)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*40.46873)+units[tochoice]);
                                   break;
                    }
                        break;
                    case 4:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*929.0304)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.9290304)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000022956806)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000009290304)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*144)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00000003587)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.11111)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0009290304)+units[tochoice]);
                                   break;
                    }
                        break;
                    case 5:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*100000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*10000)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*2.471054)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*107639.11)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*15500031)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0038610217)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*11959.9)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*100)+units[tochoice]);
                                   break;
                    }
                        break;
                    case 6:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*6.4516)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00064516)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000000159422)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.006944444)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.00000001)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0000000002)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000771604938)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0000064516)+units[tochoice]);
                                   break;
                    }   
                        break;
                    case 7:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*2589988*1000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*2589988)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*640)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*27878400)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*258.9988)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*40144896*100)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*3097600)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*25899.88)+units[tochoice]);
                                   break;
                    }                       
                        break;
                    case 8:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*8361.2736)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.83612736)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000206611251)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*9)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000083612736)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1296)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000000322831)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.0083612736)+units[tochoice]);
                                   break;
                    }   
                        break;
                    case 9:
                    switch(tochoice)
                    {
                        case 1: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1000000)+units[tochoice]);
                                   break;
                        case 2: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*100)+units[tochoice]);
                                   break;
                        case 3: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.02471)+units[tochoice]);
                                   break;
                        case 4: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1076.4)+units[tochoice]);
                                   break;
                        case 5: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.01)+units[tochoice]);
                                   break;
                        case 6: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*155000)+units[tochoice]);
                                   break;
                        case 7: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*0.000039)+units[tochoice]);
                                   break;
                        case 8: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*119.6)+units[tochoice]);
                                   break;
                        case 9: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*1)+units[tochoice]);
                                   break;
                        case 10: System.out.println("Area of"+(ar)+units[frchoice]+"="+(ar*2025.371832)+units[tochoice]);
                                    break;
                    }   
                        break;
                    case 10: System.out.println("Back to Main Menu");
                            break;
                    default:System.out.println("INVALID OPTION");
            }
            System.out.println("Press any key to Continue Forward");
            String x=br.readLine();
        }while(frchoice!=10);
    }
}
