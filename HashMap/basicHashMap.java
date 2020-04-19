
package franceioi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        String texte = entree.nextLine();
        
        texte = texte.toUpperCase();
        
        Map<Character,Integer> occurrences = new HashMap<>();
       

        for(char c : texte.toCharArray()) {
            if (!Character.isLetter(c))
                continue;
            
            if (!occurrences.containsKey(c)) {
                occurrences.put(c, 0);
            }
            
            occurrences.put(c, occurrences.get(c)+1);
        }
        
        char lettre = ' ';
        int max=0;
        
        for (Entry<Character, Integer> entry : occurrences.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                lettre = entry.getKey();
            }
        }
        System.out.println(lettre);
    }  
}