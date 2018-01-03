package com.example.android.tourguideapp1;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//import static com.example.android.tourguideapp1.R.id.colors;

/**
 * Created by qze713 on 1/2/18.
 */

public class adaptor extends ArrayAdapter<LeisureData> {

    private int mcolorResorceID;


    public  adaptor(Activity context , ArrayList<LeisureData> place){
        super(context,0, place);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        LeisureData currentPlace = getItem(position);


        int color = ContextCompat.getColor(getContext(),R.color.category_numbers);

        View textViewContainer = listItemView.findViewById(R.id.textContainer);
        textViewContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView placeName = (TextView) listItemView.findViewById(R.id.placename);
        placeName.setText(currentPlace.getMleisureName());


        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView adress = (TextView) listItemView.findViewById(R.id.address);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        adress.setText(currentPlace.getmAddress());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageid);
        if (currentPlace.hasImage()){
            imageView.setImageResource(currentPlace.getmImageResorceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
