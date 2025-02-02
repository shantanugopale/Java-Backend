package com.example.shantanu;

import java.util.HashMap;

public class DataBaseStore {

    HashMap<String, String> hs = new HashMap<>();

    public DataBaseStore() {
        hs.put("shantanu", "Family");
        hs.put("shiva", "Politics");
        hs.put("aditya", "Market");
    }

    public String getSearch(String q) {

        String result = hs.get(q);

        System.out.println(result);

        if (result == null) {
            return "No Matching Found";
        } else {
            return result;
        }
    }
}
