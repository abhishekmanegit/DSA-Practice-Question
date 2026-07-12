package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Abhishek",99);
        map.put("Part",98);
        map.put("Harsh",76);


//        System.out.println(map.getOrDefault("Soham",89));
//        System.out.println(map.get("Abhishek"));
        System.out.println(map.containsKey("Part"));
    }
}
