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

/**
 * Created by qze713 on 1/3/18.
 */

public class GridAdaptor extends ArrayAdapter<GridData> {

    private int mcolorResorceID;


    public  GridAdaptor(Activity context , ArrayList<GridData> place){
        super(context,0, place);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
            listItemView.setTag(R.id.relativelayout_imageid,listItemView.findViewById(R.id.relativelayout_imageid));
            listItemView.setTag(R.id.relativelayout_name,listItemView.findViewById(R.id.relativelayout_name));
        }

        // Get the {@link Word} object located at this position in the list
        GridData mallInfo = getItem(position);


        int color = ContextCompat.getColor(getContext(),R.color.category_numbers);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView placeName = (TextView) listItemView.findViewById(R.id.relativelayout_name);
        placeName.setText(mallInfo.getmName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.relativelayout_imageid);
        if (mallInfo.hasImage()){
            imageView.setImageResource(mallInfo.getmImageResorceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
