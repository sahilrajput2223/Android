package com.example.android.miwok;

public class Word {
    public static final int NO_IMAGE = -1;
    private String mDefalutLanguage;
    private String mMiwokLanguage;
    private int mImageResourceId = NO_IMAGE;
    private int mAudioId;

    public Word(String defalutLanguage, String miwokLanguage, int audio) {
        mDefalutLanguage = defalutLanguage;
        mMiwokLanguage = miwokLanguage;
        mAudioId = audio;
    }

    public Word(String defalutLanguage, String miwokLanguage, int imageId, int audio) {
        mDefalutLanguage = defalutLanguage;
        mMiwokLanguage = miwokLanguage;
        mImageResourceId = imageId;
        mAudioId = audio;
    }


    public String getmDefalutLanguage() {
        return mDefalutLanguage;
    }

    public String getmMiwokLanguage() {
        return mMiwokLanguage;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioId() {
        return mAudioId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
