package franceioi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jorick
 */
public class FranceIOI {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {

        String mot = entree.nextLine();
        String phrase = entree.nextLine();

        int somme = 0;
        
        String[] phraseCoupee = phrase.split(" ");
        
        for(String mot2 : phraseCoupee) {
            if(mot2.equalsIgnoreCase(mot)) {
                somme ++;
            }
        } 
        System.out.println(somme);
    }
}
