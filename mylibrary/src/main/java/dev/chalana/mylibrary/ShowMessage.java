package dev.chalana.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowMessage {
    public void show(Context context, String message){
        Toast.makeText(context, "msg::"+message, Toast.LENGTH_LONG).show();
        //
    }
}
