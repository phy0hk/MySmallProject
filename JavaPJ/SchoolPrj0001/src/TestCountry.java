import java.util.ArrayList;
import java.util.Collections;

public class TestCountry {
    public static void main(String[] args) {
        Country country[] = {
            new Country(3, "Singapore"),
            new Country(1, "Myanmar"),
            new Country(2, "New Zealand")
    };
    ArrayList<Country> countries = new ArrayList<>();
    countries.add(country[0]);
    countries.add(country[1]);
    countries.add(country[2]);

    // Arrays.sort(country);
    System.out.println("Before Sorting");
    for(int i =0;i<country.length;i++){
        System.out.println(countries.get(i));
    }
    for(int i =0;i<country.length;i++){
        Collections.sort(countries,new SortCountryByID());
    }
    System.out.println("After Sorting");
    for(int i =0;i<country.length;i++){
        System.out.println(countries.get(i));
    }
    }
}
