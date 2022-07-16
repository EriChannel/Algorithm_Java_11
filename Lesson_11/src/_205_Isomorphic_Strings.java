import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "add";
        String t = "egg";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            System.out.println("sChar : " + sChar );
            System.out.println("tChar : " + tChar );

            if(map1.containsKey(sChar)){
                if(map1.get(sChar) != tChar){
                    return false;
                }
            }

            if (map2.containsKey(tChar)) {
                if (map2.get(tChar)  != sChar){
                    return false;
                }
            }

            map1.put(sChar, tChar);
            map2.put(tChar, sChar);

            System.out.println("map1: " + map1);
            System.out.println("map2: "+map2);
        }
        return true;
    }
}
