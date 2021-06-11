
package sessionproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CitiescsvDAO {
    
    public ArrayList<City> list_of_cities ;
    
    public CitiescsvDAO(){
        list_of_cities = new ArrayList<>();
    }
    
   List<City> readCitiesFromCsv(String fName){
        
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
                City my_city = init_city(attributes);
                list_of_cities.add(my_city);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
       return list_of_cities;
        
   }
   
   private static City init_city(String [] info){
       
     String city_id = info[0];
     int city_id_int = Integer.parseInt(city_id);
     String city = info[1];
     String country_id = info[2];
     String capital = info[3];
     String pop = info[4];
     int pop_int = Integer.parseInt(pop);
     return new City(city_id_int , city , country_id , capital,pop_int);
       
   }
    
}
