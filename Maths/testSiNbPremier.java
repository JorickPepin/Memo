package franceioi;

import java.util.Scanner;

/**
 *
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        int nb = entree.nextInt();
        
        boolean estPremier = true;

        int i = 2;
        while (estPremier && i < nb) {

            if (nb % i == 0) {
                estPremier = false;
            }
            
            i++;
        }

        if (estPremier) {
            System.out.println("Premier");
        } else {
            System.out.println("Composé");
        }
    }
}
