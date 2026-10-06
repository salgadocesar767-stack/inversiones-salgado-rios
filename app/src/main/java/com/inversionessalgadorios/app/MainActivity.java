package com.inversionessalgadorios.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        setContentView(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/inversiones_salgado_rios.html");
    }
    @Override public void onBackPressed() {
        WebView w=(WebView)((android.view.ViewGroup)findViewById(android.R.id.content)).getChildAt(0);
        if(w.canGoBack()) w.goBack(); else super.onBackPressed();
    }
}
