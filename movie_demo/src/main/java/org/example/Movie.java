package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

    private int id;
    private String title;
    private String[] category;
    private String director;
    private int length;
    private Date release;
    private int view;


}
