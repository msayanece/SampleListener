package com.sayan.samplelistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        ///////////////////////////// 3 //////////////////////////////////
        implements Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventHandler.setOnClickListener(new MyListener());          //1

        EventHandler.setOnClickListener(new Listener() {            //2
            @Override
            public void onClick(String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        EventHandler.setOnClickListener(this);                      //3
        EventHandler.setOnClickListener(new MyExternalListener(this));      //4
    }

    @Override
    public void onClick(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }


    ///////////////////////////// 1 //////////////////////////////////
    class MyListener implements Listener{

        @Override
        public void onClick(String s) {
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
        }
    }
}
