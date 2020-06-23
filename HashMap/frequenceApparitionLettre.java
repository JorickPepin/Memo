package franceioi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Afficher la fréquence d'apparition des lettres de l'alphabet dans une phrase
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Character,Integer> alphabet = new HashMap<>();
        
        // initialisation avec les lettres de l'alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.put(c, 0);
        }
        
        int nb = 0;
        
        String phrase = entree.nextLine().toLowerCase();
        
        for (char c : phrase.toCharArray()) {
            if (Character.isLetter(c)) {
                nb++;
                alphabet.put(c, alphabet.get(c) + 1);
            }  
        }

//        for (int i : alphabet.values()) {
//             System.out.println((double) i / (double) nb);
//        }
 
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println((double) alphabet.get(c) / (double) nb);
        }
    }
}
