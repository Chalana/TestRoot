package dev.chalana.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowMessage {
    public void show(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        //
    }
}
