package com.example.tubes.ui.alatpertanian;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlatpertanianViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlatpertanianViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alat pertanian fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}