package com.example.blast.ui.student_feed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StudentFeedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StudentFeedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is student feed fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}