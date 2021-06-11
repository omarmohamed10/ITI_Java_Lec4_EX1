package sessionproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountriescsvDAO {

    List<country> list_of_countries;
    public CountriescsvDAO(){
        list_of_countries = new ArrayList<>();
    }
    List<country> readCountriesFromCsv(String fName){
        
        try {
            Scanner sc = new Scanner(new File(fName));
            sc.useDelimiter(",");
            String [] headers = new String[10];
            String [] attributes = new String[10];
            if(sc.hasNextLine()){
                headers = sc.nextLine().split(",");
            }
            
            //System.out.println(headers.length);
            /*for(int i =0 ; i<headers.length ; i++){
                System.out.println(headers[i]);
            }*/
            while(sc.hasNextLine()){
                attributes = sc.nextLine().split(",");
                country my_country = init_country(attributes);
                list_of_countries.add(my_country);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
       return list_of_countries;
        
   }
    private static country init_country(String [] info){
       
     String country_name = info[0];
     String country_code = info[1];
     
     return new country(country_name,country_code);
       
   }
    
    
}
