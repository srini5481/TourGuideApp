package com.example.android.tourguideapp1;


import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeisureFragment extends Fragment {


    public LeisureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);




        final ArrayList<LeisureData> place = new ArrayList<LeisureData>();

        // adding elements to array list

        place.add(new LeisureData("Adarsh Hamilton", "2/4, Langford Garden Road, Richmond Town, Bengaluru, Karnataka 560025, India"));
        place.add(new LeisureData("Marriott Bengaluru", "Outer Ring Road, Marathahalli Sarjapur Road, Bellandur, Bengaluru, Karnataka 560103, India"));
        place.add(new LeisureData("ITC Gardenia ", "1, Residency Road, Shanthala Nagar, Ashok Nagar, Bengaluru, Karnataka 560025, India"));
        place.add(new LeisureData("The Chancery Pavilion", "135, Residency Road, Bengaluru, Karnataka 560025, India"));
        place.add(new LeisureData("ITC Windsor", "25, Windsor Square, Golf Course Road, Bengaluru, Karnataka 560052, India"));
        place.add(new LeisureData("The LaLiT Ashok", "Kumara Krupa High Grounds, Next to CM Guest House, Bengaluru, Karnataka 560001, India"));
        place.add(new LeisureData("Nandhini Palace", "Plot No. 72, Next To Bishop Cotton's Girls School, St Mark's Road, Bengaluru, Karnataka 560001, India"));
        place.add(new LeisureData("Shangri-La", "No.56-6B, Palace Road,, Bengaluru, Karnataka 560052, India\n"));
        place.add(new LeisureData("Le Méridien", "No. 28 Sankey Road, P.B. No. 174 (Opposite Bangalore Golf Club), Bengaluru, Karnataka 560052, India"));
        place.add(new LeisureData("St Mark's", "4/1, St Marks Rd, Sampangi Rama Nagar, Bengaluru, Karnataka 560001, India"));



        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        adaptor adapter = new adaptor(getActivity(),place);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return listView;
    }

}
