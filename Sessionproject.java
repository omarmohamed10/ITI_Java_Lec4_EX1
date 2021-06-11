package sessionproject;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


// Name : Omar Mohamed Abd EL-Hamid
// Group: G_10

public class Sessionproject {

    public static void main(String[] args) {
        
        CitiescsvDAO  D = new CitiescsvDAO();
        List<City>cities = D.readCitiesFromCsv("cities.csv");
        /*for(int i = 0 ; i<cities.size() ; i++){
            System.out.println(cities.get(i));
        }*/
        
        CountriescsvDAO  D2 = new CountriescsvDAO();
        List<country>countries = D2.readCountriesFromCsv("countries.csv");
        /*for(int i = 0 ; i<countries.size() ; i++){
            System.out.println(countries.get(i));
        }*/
        
        HashMap<String,City> hm = new HashMap<String,City>();
        HashMap<String,List<City>> hm2 = new HashMap<String,List<City>>();
        
        
        for(int i = 0 ; i<countries.size() ; i++){
            if(hm.get(countries.get(i).getCode()) == null){
                List<City> lsC = new ArrayList<>();
                for(int j = 0 ; j<cities.size() ; j++){
                    if(countries.get(i).getCode().equals(cities.get(j).getCountry_id())){
                        
                        City c = cities.get(j);
                        lsC.add(c);
                        //hm.put(countries.get(i).getCode(), c);
                        //break;
                    }
                }
                
                lsC.sort(Comparator.comparing( City::getPop) );
                       
                hm2.put(countries.get(i).getCode(), lsC);
        }  
    }
        /*for (Map.Entry en : hm.entrySet()) {
          System.out.println("Key: "+en.getKey() + " & Value: " + en.getValue());
          System.out.println();
        }*/
        for (Map.Entry en : hm2.entrySet()) {
          System.out.println("Key: "+en.getKey() + " & Value: " + en.getValue());
          System.out.println("/////////////////");
        }
        
        
        
        
    
}
    
}
