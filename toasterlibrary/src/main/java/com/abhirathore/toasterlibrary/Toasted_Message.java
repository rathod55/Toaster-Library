package com.abhirathore.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toasted_Message {

    public static void show(Context c, String msg)
    {
        Toast.makeText(c,msg,Toast.LENGTH_LONG).show();
    }
}
