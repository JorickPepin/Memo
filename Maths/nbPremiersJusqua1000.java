package franceioi;

/**
 * Affiche les nombres premiers jusqu'à 1000
 * @author Jorick
 */
public class FranceIOI {

    public static void main(String[] args) {

        boolean estPremier;

        int nb = 2;

        while (nb <= 1000) {

            estPremier = true;

            for (int i = 2; i < nb; i++) {
                if (nb % i == 0) {
                    estPremier = false;
                }
            }

            if (estPremier) {
                System.out.println(nb);
            }

            nb++;
        }

    }
}
