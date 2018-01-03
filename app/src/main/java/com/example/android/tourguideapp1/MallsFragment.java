package com.example.android.tourguideapp1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<GridData> malldata = new ArrayList<GridData>();

        // adding elements to array list

        malldata.add(new GridData("P.E.S",R.drawable.school_pes));
        malldata.add(new GridData("S.M.V",R.drawable.school_smv));
        malldata.add(new GridData("D.B.I.T.C.E",R.drawable.school_don));
        malldata.add(new GridData("P.E.S",R.drawable.school_pes));
        malldata.add(new GridData("S.M.V",R.drawable.school_smv));
        malldata.add(new GridData("D.B.I.T.C.E",R.drawable.school_don));
        malldata.add(new GridData("P.E.S",R.drawable.school_pes));
        malldata.add(new GridData("S.M.V",R.drawable.school_smv));
        malldata.add(new GridData("D.B.I.T.C.E",R.drawable.school_don));
        malldata.add(new GridData("P.E.S",R.drawable.school_pes));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        GridAdaptor adapter = new GridAdaptor(getActivity(),malldata);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);

        gridView.setAdapter(adapter);
        return gridView;
    }

}
