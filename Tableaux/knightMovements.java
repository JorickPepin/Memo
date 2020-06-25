package franceioi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Entrée : plateau 8x8, lettres MAJ = pièces blanches, lettres MIN = pièces noires, '.' = cases vides
 * Sortie : yes si un cavalier blanc peut manger une pièce noire, no sinon
 * 
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(final String[] args) {

        char[][] plateau = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String ligne = entree.nextLine();
            for (int j = 0; j < 8; j++) {
                plateau[i][j] = ligne.charAt(j);
            }
        }

        System.out.println(canWin(plateau) ? "yes" : "no");
    }

    private static boolean canWin(char[][] plateau) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (plateau[i][j] == 'C' && canEat(plateau, i, j))
                    return true;
            }
        }

        return false;
    }

    private static boolean canEat(char[][] plateau, int i, int j) {
        return isBlack(plateau, i + 2, j + 1)
            || isBlack(plateau, i - 2, j + 1)
            || isBlack(plateau, i + 2, j - 1)
            || isBlack(plateau, i - 2, j - 1)
            || isBlack(plateau, i + 1, j + 2)
            || isBlack(plateau, i - 1, j + 2)
            || isBlack(plateau, i + 1, j - 2)
            || isBlack(plateau, i - 1, j - 2);
    }

    private static boolean isBlack(char[][] plateau, int i, int j) {
        if (i < 0 || i >= 8) return false;
        if (j < 0 || j >= 8) return false;

        return Character.isLowerCase(plateau[i][j]) && Character.isLetter(plateau[i][j]);
    }
}

