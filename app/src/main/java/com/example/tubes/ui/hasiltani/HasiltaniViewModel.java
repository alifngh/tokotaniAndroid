package com.example.tubes.ui.hasiltani;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HasiltaniViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HasiltaniViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is hasil Tani fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}