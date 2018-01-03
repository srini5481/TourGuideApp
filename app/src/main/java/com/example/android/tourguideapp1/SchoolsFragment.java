package com.example.android.tourguideapp1;


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
public class SchoolsFragment extends Fragment {


    public SchoolsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);




        final ArrayList<LeisureData> place = new ArrayList<LeisureData>();

        // adding elements to array list

        place.add(new LeisureData("P.E.S. College of Engineering", "Hosur Rd, Konappana Agrahara, Electronic City, Bengaluru, Karnataka 560100, India",R.drawable.school_pes));
        place.add(new LeisureData("Sir M. Visvesvaraya Institute of Technology", "Krishnadeveraya Nagar, International Airport Road, Yelahanka, Hunasamaranahalli, Bengaluru, Karnataka 562157, India",R.drawable.school_smv));
        place.add(new LeisureData("Don Bosco Institute of Technology", "Kumbalagodu, Mysore Road, Bengaluru, Karnataka 560074, India",R.drawable.school_don));
        place.add(new LeisureData("JSSATE", "JSSATE-B Campus, Dr. Vishnuvardan Road, Srinivapura Post, Bengaluru, Karnataka 560060, India",R.drawable.school_jss));
        place.add(new LeisureData("B.M.S. College of Engineering", "Bull Temple Rd, Basavanagudi, Bengaluru, Karnataka 560019, India",R.drawable.school_bms));
        place.add(new LeisureData("Dr. Ambedkar Institute of Technology", "Jnana Bharathi Campus, Bengaluru, Karnataka 560056, India",R.drawable.school_bra));
        place.add(new LeisureData("Ramaiah Institute of Technology", "MSR College Road, MSR Nagar, Bengaluru, Karnataka 560054, India",R.drawable.school_msr));
        place.add(new LeisureData("R.V. College of Engineering", "R. V. Vidyanikethan Post, Bengaluru, Karnataka 560059, India",R.drawable.school_rvc));
        place.add(new LeisureData("Christ College", "Hosur Road, Bhavani Nagar, Bengaluru, Karnataka 560029, India",R.drawable.school_cu));
        place.add(new LeisureData("UVCE", "K R Circle, Dr Ambedkar Veedhi, Bengaluru, Karnataka 560001, India",R.drawable.school_uvce));



        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        adaptor adapter = new adaptor(getActivity(),place);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return listView;

    }

}
