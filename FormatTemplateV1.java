import java.util.Scanner;
import javax.swing.JOptionPane;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  AxQy
 **********************************************/
public class FormatTemplateV1{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
    
    // **** Objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  AxQy" + nl;
        banner += "******************************";
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
    // **** processing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
