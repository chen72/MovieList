package sg.edu.rp.c346.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046469 on 17/7/2017.
 */

public class MovieAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public MovieAdapter(Context context, int resource,
                        ArrayList<Movie> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = (TextView) rowView.findViewById(R.id.textViewDescription);

        ImageView IvMovie=(ImageView)rowView.findViewById(R.id.imageView);
        // Obtain the to-do item based on the 'position'.
        Movie currentItem = movieList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getYear()+"-"+currentItem.getGenre()+currentItem.getIn_theatre());
        if(currentItem.getReted()=="g"){
            IvMovie.setImageResource(R.drawable.rating_g);
        }else if(currentItem.getReted()=="pg"){
            IvMovie.setImageResource(R.drawable.rating_pg);
        }else if(currentItem.getReted()=="pg13"){
            IvMovie.setImageResource(R.drawable.rating_pg13);
        }else if(currentItem.getReted()=="nc16"){
            IvMovie.setImageResource(R.drawable.rating_nc16);
        }else if(currentItem.getReted()=="m18"){
            IvMovie.setImageResource(R.drawable.rating_m18);
        }else {
            IvMovie.setImageResource(R.drawable.rating_r21);
        }
        //return the View corresponding to the data at the specified position.
        return rowView;
    }
}
