package com.example.arcloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionPerformed(View view) {
        SimpleArcDialog mDialog = new SimpleArcDialog(this);
        mDialog.setConfiguration(new ArcConfiguration(this));
        mDialog.setTitle("Loading..");
        mDialog.show();
    }
}
