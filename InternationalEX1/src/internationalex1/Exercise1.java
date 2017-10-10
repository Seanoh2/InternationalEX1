/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internationalex1;
import java.util.Locale;

/**
 *
 * @author Seanoh
 */
public class Exercise1 {
    public void displayAllLocale() {
        Locale [] locales = Locale.getAvailableLocales();
        for(Locale item : locales) {
            System.out.println(item.toString());
            System.out.println(item.getDisplayName());
            System.out.println("");
        }
    }
}
