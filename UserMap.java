package quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMap {
    public static void main(String[] args) {
        Map<Integer, String> Map = new HashMap<>();
        Map.put(1, "Jack");
        Map.put(2, "Jason");
        Map.put(3, "Michelle");
        Map.put(4, "Jeff");

        Map<String, List<String>> list = new HashMap<String, List<String>>();

        for (Map.Entry<Integer, String>entry : Map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
