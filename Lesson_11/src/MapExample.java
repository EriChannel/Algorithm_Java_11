import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Chris");
        hashMap.put(3, "Emma");
        hashMap.put(1, "Victor");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(hashMap.get(3));

        System.out.println(hashMap.containsKey(1));

        System.out.println(hashMap.remove(1));

        System.out.println(hashMap);
    }
}
