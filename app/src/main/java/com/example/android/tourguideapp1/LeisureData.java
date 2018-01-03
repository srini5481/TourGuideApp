package com.example.android.tourguideapp1;

/**
 * Created by qze713 on 1/2/18.
 */

public class LeisureData {


    public static final int NO_IMAGES_PROVIDED = -1;


    private String mleisureName;


    private String mAddress;

    private int mImageResorceId = NO_IMAGES_PROVIDED;


    public String getMleisureName() {
        return mleisureName;
    }

    public String getmAddress() {
        return mAddress;
    }


    public LeisureData(String leisureName, String Address){
         mleisureName= leisureName;
        mAddress = Address;
    }

    public LeisureData(String leisureName, String Address,int imageResorceID){
        mleisureName= leisureName;
        mAddress = Address;
        mImageResorceId=imageResorceID;
    }


    public boolean hasImage(){
        return mImageResorceId != NO_IMAGES_PROVIDED;
    }

    public int getmImageResorceId() {
        return mImageResorceId;
    }
}
