package com.hashim.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.googlegroup);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://bit.ly/2Z1xAs6");
    }
}
