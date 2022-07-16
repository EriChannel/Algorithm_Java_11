package org.example;

import java.util.ArrayList;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieService service = new MovieService();
        ArrayList<Movie> list = service.getAllMovie();

        service.show(list);

        Map<String, Integer> map = service.getCategory(list);
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }



    }
}
