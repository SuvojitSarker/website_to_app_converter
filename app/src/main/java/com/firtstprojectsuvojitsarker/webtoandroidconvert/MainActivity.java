package com.firtstprojectsuvojitsarker.webtoandroidconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wView = findViewById(R.id.wView);
        wView.getSettings().setJavaScriptEnabled(true);
        //input your website link in this "" and run the app
        wView.loadUrl("");
    }
}