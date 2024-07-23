import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        teacher tr0 = new parttime("Sa yar gyi", "House", "09134525", "Game");
        System.out.println(tr0);
        School st0 = new student("Sa Yar Lay", "Under Ground", "091245667", "sayarlay@gmail.com", "123455");
        School st[] = {
            new student("A Sa Yar Lay", "Under Ground", "091245667", "sayarlay@gmail.com", "123455"),
            new student("B Sa Yar Lay", "Under Ground", "091245667", "sayarlay@gmail.com", "123455"),
            new student("C Sa Yar Lay", "Under Ground", "091245667", "sayarlay@gmail.com", "123455"),
            new student("D Sa Yar Lay", "Under Ground", "091245667", "sayarlay@gmail.com", "123455")
        };
        ArrayList<student> st1 = new ArrayList<student>();
        st1.add(new student("Salay Zee Tee", "Live Beside Kyaw Tint House", "091245667", "sayarlay@gmail.com", "12355"));
        st1.add(new student("Kyaw Tint", "Live Beside Aung House", "091245667", "sayarlay@gmail.com", "12455"));
        st1.add(new student("Aung Hla", "Live Beside Khin Lay Thu House", "091245667", "sayarlay@gmail.com", "13455"));
        st1.add(new student("Khin Lay Thu", "Live Beside San San Win House", "091245667", "sayarlay@gmail.com", "23455"));
        st1.add(new student("San San Win", "Live Beside Salay Zee Tee House", "091245667", "sayarlay@gmail.com", "12345"));
        // Arrays.sort(st);
        for(int i = 0;i<st.length;i++){
        Collections.sort(st1,new SortByStudentID());
        }
        System.out.println(st1);
        // for(School gg : st1){
        //     System.out.println(gg);
        // }
    }
}
