package sg.edu.rp.c346.movielist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView MovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Bind the ListView UI element to the ListView variable inside the onCreate method
        MovieList = (ListView)findViewById(R.id.listViewMovie);
        //Declare Arraylist and CustomAdapter variables inside the onCreate method

        ArrayList<Movie> movieList;
        MovieAdapter movie;
        //Creating instance of ArrayList to store the ListView item data
        movieList = new ArrayList<Movie>();
        //Creating instance of ArrayAdapter, binding it to ArrayList
        movie = new MovieAdapter(this, R.layout.movie_row, movieList);
        //Bind the CustomAdapter to ListView variable
        MovieList.setAdapter(movie);
        Movie m1 = new Movie("The Avengers"," 2012","pg13","Action | Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army."); //Create a ToDoItem object named item1
        movieList.add(m1);
        Movie m2 = new Movie("Planes"," 2013","pg","Animation | Comedy","15/5/2015","Cathay - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race."); //Create a ToDoItem object named item1
        movieList.add(m2);

        MovieList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent newActivity = new Intent(view.getContext(),AnswerActivity.class);
                startActivity(newActivity);
            }
        });

    }
}
