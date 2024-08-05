
import java.util.Comparator;

public class Country {
    Integer id;
    String name;
    Country(int id ,String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Country Id: "+id+"  CountryName: "+name;
    }
}
class SortCountryByID implements Comparator<Country>{

    @Override
    public int compare(Country o1, Country o2) {
        return o1.id.compareTo(o2.id);
    }

}