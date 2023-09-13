package com.example.newsapp;


import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressBar);

        String websiteUrl = getIntent().getStringExtra("website_url");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set a WebChromeClient to handle progress updates
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                // Update the ProgressBar's progress based on the web page's loading progress
                progressBar.setProgress(newProgress);

                progressBar.setVisibility(ProgressBar.VISIBLE);
                // When the page loading is complete (30%), hide the ProgressBar
                if (newProgress == 30) {
                    progressBar.setVisibility(ProgressBar.GONE);
                }
            }
        });

        webView.loadUrl(websiteUrl);

    }
}