package com.sayan.samplelistener;

import android.content.Context;
import android.widget.Toast;

///////////////////////////// 4 //////////////////////////////////
public class MyExternalListener implements Listener {

    private Context context;

    public MyExternalListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
