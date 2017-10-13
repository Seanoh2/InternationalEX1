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
 * @author Sean
 */
public class Exercise2 {

    public void displayText() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a language code:");
        String language = input.nextLine();

        Locale currentLocale = new Locale(language);
        ResourceBundle messages = ResourceBundle.getBundle("internationalEX1.text", currentLocale);

        System.out.println(messages.getString("login.label.username"));
        System.out.println(messages.getString("login.label.password"));
        System.out.println(messages.getString("login.button.submit"));
    }
}
