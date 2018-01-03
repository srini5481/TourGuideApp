package com.example.android.tourguideapp1;

/**
 * Created by qze713 on 1/3/18.
 */

public class GridData  {

    public static final int NO_IMAGES_PROVIDED = -1;


    private String mName;

    private int mImageResorceId = NO_IMAGES_PROVIDED;


    public String getmName() {
        return mName;
    }

    public int getmImageResorceId() {
        return mImageResorceId;
    }



    public GridData(String name,int imageResorceID){
        mName=name;
        mImageResorceId=imageResorceID;
    }


    public boolean hasImage(){
        return mImageResorceId != NO_IMAGES_PROVIDED;
    }



}
