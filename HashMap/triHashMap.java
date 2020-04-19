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
        
        int nbMots = entree.nextInt();
        
        Map<String,String> liste = new HashMap<>();
        Set<Entry<String, String>> entries = liste.entrySet();
        
        for(int i=0; i<nbMots; i++) {
            String premier = entree.next();
            String deuxieme = entree.next();
            
            liste.put(premier, deuxieme);
        }
        
        Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
            
            @Override
            public int compare(Entry<String, String> e1, Entry<String, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        
        List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries);
        Collections.sort(listOfEntries, valueComparator);
        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
        
        for(Entry<String, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        
        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        
        for(Entry<String, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getValue() + " " + mapping.getKey());
        }
    }
}
