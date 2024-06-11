import java.util.Arrays;

/**
 * TV
 */
public class TV implements Comparable<TV>{
    private String brand;
    private int price;
     public TV(String brand,int price){
        this.brand = brand;
        this.price = price;
     }
     @Override
     public String toString() {
         return String.format("Tv (%s, %d)", brand,price);
     }
     public int compareTo(TV o){
        return this.brand.compareTo(o.brand);
     }
     public static void main(String[] args){
        TV list[] = {
            new TV("Sony", 100000),
            new TV("Panasonic", 90000),
            new TV("Toshiba", 1500000),
            new TV("Samsung", 1200000),
            new TV("LG", 200000)
        };
        Arrays.sort(list);
        for (TV tv:list){
            System.out.println(tv);
        }
     }
}