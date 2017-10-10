/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internationalex1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Seanoh
 */
public class InternationalEX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise1 work = new Exercise1();
        //work.displayAllLocale();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a language code:");
        String language = input.nextLine();

        Locale currentLocale = new Locale(language);
        ResourceBundle messages = ResourceBundle.getBundle("text", currentLocale);

        System.out.println(messages.getString("login.label.username"));
        System.out.println(messages.getString("login.label.password"));
        System.out.println(messages.getString("login.button.submit"));
    }
    
}
