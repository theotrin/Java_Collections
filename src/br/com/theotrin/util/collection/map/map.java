package br.com.theotrin.util.collection.map;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "Trindade");
        map.put("1", "Theo");
        map.put("3", "guido");

        System.out.println(map.values());
        System.out.println(map.keySet());

        System.out.println(map);

    }
}
