package franceioi;

import java.util.Scanner;

/**
 *
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        String initiales = entree.nextLine().toLowerCase();
        
        int nbLignes = entree.nextInt();
       
        entree.next();
       
        for(int i=0; i<nbLignes; i++) {
            String[] mots = entree.nextLine().toLowerCase().split(" ");
            
            boolean estValide = true;
            
            if (mots.length != initiales.length()) {
                continue;
            }
            
            for (int j = 0; j < initiales.length(); j++) {
                if(mots[j].charAt(0) != initiales.charAt(j)) {
                    estValide = false;
                }
            }
            
            if (estValide) {
                for (int j = 0; j < mots.length; j++) {
                    String mot = mots[j].substring(0,1).toUpperCase() + mots[j].substring(1).toLowerCase();
                    System.out.print(mot + " ");
                }
                System.out.println();
            }
        }  
    }
}
