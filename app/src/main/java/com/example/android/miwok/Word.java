package com.example.android.miwok;

public class Word {

    private String mDefaultTransaltion;
    private String mMiwokTransaltion;
    private int mAudioResourceID;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTransaltion = defaultTranslation;
        mMiwokTransaltion = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTransaltion, int imageResourceId, int audioResourceID) {
        mDefaultTransaltion = defaultTranslation;
        mMiwokTransaltion = miwokTransaltion;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTransaltion, int audioResourceID) {
        mDefaultTransaltion = defaultTranslation;
        mMiwokTransaltion = miwokTransaltion;
        mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTransaltion;
    }

    public String getMiwokTransaltion() {
        return mMiwokTransaltion;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }
}
