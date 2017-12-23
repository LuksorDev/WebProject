package pai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.regex.*;
import java.net.URL;
 
public class pai2 {
	public static void main(String[] args) {
        try {
            URL website = new URL("http://www.weeia.p.lodz.pl/dla-studentow/opiekunowie-pierwszego-roku/");
            BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));
            String inputLine; 
            String patternm = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+";
            String patternl = "e";
            Pattern m = Pattern.compile(patternm);
            Pattern l = Pattern.compile(patternl);
 
            while ((inputLine = in.readLine()) != null) {
            	Matcher mm = m.matcher(inputLine);
                if (mm.find( )) {
               	System.out.println(mm.group());
              	System.out.println("\n");
                	
                }
                
            }
            
  //          while ((inputLine = in.readLine()) != null) {
  //            	Matcher ml = l.matcher(inputLine);
   //             if (ml.find( )) {
  //                	System.out.println(ml.group());
  //                 	System.out.println("\n");

 //               }
//            }
            
            in.close(); 
        } catch (MalformedURLException me) {
            System.out.println(me); 
 
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}