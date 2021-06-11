
package sessionproject;

public class City{
  
    private int city_id;
    private String city;
    private String country_id;
    private String capital;
    private int pop;

    public City(int city_id , String city , String country_id , String capital,int pop){
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
        this.capital = capital;
        this.pop = pop;
    }
    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
    
    @Override
    public String toString(){
       
        return "city is "+'('+city+')' + ", country_code is "+'('+country_id+')'
                +", population is "+'('+pop+')';
    
}
    
    
    
}
