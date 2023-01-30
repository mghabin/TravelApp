package edu.birzeit.ui.reservations;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import edu.birzeit.MainActivity;

public class ReservationsViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public ReservationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is reservations fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}