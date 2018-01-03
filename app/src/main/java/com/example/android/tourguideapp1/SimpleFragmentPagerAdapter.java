package com.example.android.tourguideapp1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by qze713 on 1/2/18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext=context;


    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LeisureFragment();
        } else if (position == 1){
            return new SchoolsFragment();
        } else if (position == 2){
            return new MallsFragment();
        } else {
            return new LeisureFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_hotel);
            case 1:
                return mContext.getString(R.string.category_schools);
            case 2:
                return mContext.getString(R.string.category_malls);
            case 3:
                return mContext.getString(R.string.category_Resturants);
            default:
                return null;
        }
    }

}
