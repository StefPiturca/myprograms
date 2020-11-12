/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author vic
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Giraffe Academy");
      String phrase = "Giraffe Academy";
    System.out.println(phrase.toUpperCase());
    System.out.println(phrase.contains(phrase));         
    System.out.println(phrase.lastIndexOf("a"));
    System.out.println(phrase.substring(0, phrase.indexOf(" ")));
    
    }
    
    
}
