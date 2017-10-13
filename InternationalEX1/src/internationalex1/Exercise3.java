/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internationalex1;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Seanoh
 */
public class Exercise3 {

    public void displayLanguageExpanded() {
        NumberFormat numberFormat = new NumberFormat() {
            @Override
            public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Number parse(String source, ParsePosition parsePosition) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a language code:");
        String language = input.nextLine();
        
        System.out.println("Please enter a country code:");
        String country = input.nextLine();

        Locale currentLocale = new Locale(language, country);
        ResourceBundle messages = ResourceBundle.getBundle("internationalEX1.text", currentLocale);

        
        System.out.print("You entered the following language:");
        System.out.println("\t" + currentLocale.getLanguage());
        
        System.out.print("You entered the following country:");
        System.out.println("\t" + currentLocale.getCountry());
        
        System.out.print("Your currency is:");
        System.out.println("\t" + numberFormat.getCurrencyInstance(currentLocale));
        
    }
}
