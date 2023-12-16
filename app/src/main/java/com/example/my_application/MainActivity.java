package com.example.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button01;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = (Button) findViewById(R.id.button01);
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/gif_animation.html");

    }

    public void clickButton01 (View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}