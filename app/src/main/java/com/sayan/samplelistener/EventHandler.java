package com.sayan.samplelistener;

public class EventHandler {
    static Listener myListener;
    static void setOnClickListener(Listener listener){
        myListener = listener;
    }

    static void listen(){
        myListener.onClick("I have listened");
    }
}
