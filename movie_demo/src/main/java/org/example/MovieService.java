package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.xml.validation.Validator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MovieService {
    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> list = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");

            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;
    }
    public void show(ArrayList<Movie> list){
        for(Movie m : list){
            System.out.println(m.getId() + " - " + m.getTitle() + " - " +
                    Arrays.toString(m.getCategory()) + " - " + m.getDirector() +
                    " - " + m.getLength() + " - " + Util.formatDate(m.getRelease()) + " - " +
                    m.getView());
        }
    }

    public Map<String, Integer> getCategory(ArrayList<Movie> list){
        Map<String, Integer> mapCategory = new HashMap<>();
        for(Movie m : list){
            String[] categories = m.getCategory();
            for(String s: categories){
                if(mapCategory.containsKey(s)){
                    mapCategory.put(s, mapCategory.get(s) + 1);
                }else {
                    mapCategory.put(s, 1);
                }
            }
        }
        return mapCategory;
    }
}
