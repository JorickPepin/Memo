package franceioi;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Vérification si un carré est magique
 * Un carré est magique si : 
 * - la somme des nombres de chaque colonne, chaque ligne et de chacune des deux diagonales est la même
 * - il contient une fois chaque nombre, de 1 au nombre de cases de la grille
 * 
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        int nbCases = entree.nextInt();
        
        int[][] grille = new int[nbCases][nbCases];
        
        for (int i=0; i < nbCases; i++) {
            for (int j=0; j < nbCases; j++) {
                grille[i][j] = entree.nextInt();
            }
        }
                
        if(isMagic(grille, nbCases)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean isMagic(int[][] grille, int nbCases) {
        
        HashSet<Integer> liste = new HashSet<>();
        
        int sommeReference = 0;
        
        // somme lignes
        for (int i=0; i < nbCases; i++) {
            int sommeLigne = 0;
            for (int j=0; j < nbCases; j++) {
                sommeLigne += grille[i][j];
                
                if (i == 0) {
                    sommeReference += grille[i][j];
                }          
                
                if (grille[i][j] <= nbCases * nbCases && grille[i][j] >= 1) {
                    
                    if (liste.contains(grille[i][j])) {
                        return false;
                    } else {
                        liste.add(grille[i][j]);
                    }          
                }
            }
            if (sommeLigne != sommeReference) {
                return false;
            }
        }
        
        // somme colonnes
        for (int i=0; i < nbCases; i++) {
            int sommeColonne = 0;
            for (int j=0; j < nbCases; j++) {
                sommeColonne += grille[j][i];
            }
            if (sommeColonne != sommeReference) {
                return false;
            }
            
        }

        // somme diagonales
        int diagonale1 = 0;
        int diagonale2 = 0;
        for (int i = 0; i < nbCases; i++) {
            diagonale1 += grille[i][i];  
            diagonale2 += grille[i][nbCases - 1 - i];
        }
        if (diagonale1 != sommeReference || diagonale2 != sommeReference) {
            return false;
        }
        
        // on vérifie qu'il y a le bon nombre de valeurs dans la liste
        if (liste.size() != nbCases*nbCases) {
            return false;
        }
        
        return true;
    }
}
