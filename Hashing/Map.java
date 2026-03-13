import java.util.*;
public class Map{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //insert

        hm.put("India", 150);
        hm.put("China", 50);
        hm.put("America", 1050);
        System.out.println(hm);
        // System.out.println(hm.get("Indonesia"));
        System.out.println(hm.containsKey("Indo"));
        //remove
        System.out.println(hm.remove("China"));
    }
}