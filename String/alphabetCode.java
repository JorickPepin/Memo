package franceioi;

import java.util.Scanner;

/**
 *
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        String ligne = entree.nextLine();
        
        String mot = entree.nextLine();
        
        StringBuilder sortie = new StringBuilder();
            
        char[] lettresMin = new char[26];
        char[] lettresMaj = new char[26];
        
        for(int i = 0; i< 26; i++) {
            lettresMin[i] = ligne.charAt(i);
            lettresMaj[i] = (char) (ligne.charAt(i) - 'a' + 'A'); // on remplit avec la lettre maj qui correspond
        }
            
        for(char c : mot.toCharArray()) {
            
            if(c >= 'a' && c <= 'z') {
                sortie.append(lettresMin[c - 'a']);
            } else if (c >= 'A' && c <= 'Z') {
                sortie.append(lettresMaj[c - 'A']);
            } else {
                sortie.append(c);
            }  
        }
            
        System.out.println(sortie);
    }
}
