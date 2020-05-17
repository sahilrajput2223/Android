package com.example.android.tourindia;

public class places {

    public static final int NO_IMAGE = -1;
    private int mImageId = NO_IMAGE;
    private String mName;
    private boolean mFlagForSecondImage = false;
    private String mAbout;
    private String mState;
    private String mLikes;
    private boolean hasImage = false;


    public places(int mImageId, String mName, String mAbout, String mState, String mLikes) {
        this.mImageId = mImageId;
        this.mName = mName;
        this.mAbout = mAbout;
        this.mFlagForSecondImage = true;
        this.mState = mState;
        this.mLikes = mLikes;
    }

    public places(int mImageId, String mName, String mState, String mLikes) {
        this.mImageId = mImageId;
        this.mName = mName;
        this.mState = mState;
        this.mLikes = mLikes;
    }


    public places(String mName, String mAbout, String mState, String mLikes) {
        this.mName = mName;
        this.mAbout = mAbout;
        this.mState = mState;
        this.mLikes = mLikes;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmName() {
        return mName;
    }

    public String getmAbout() {
        return mAbout;
    }

    public String getmState() {
        return mState;
    }

    public String getmLikes() {
        return mLikes;
    }

    public boolean isHasImage() {
        return mImageId != NO_IMAGE;
    }

    public boolean ismFlagForSecondImage() {
        return mFlagForSecondImage;
    }
}
