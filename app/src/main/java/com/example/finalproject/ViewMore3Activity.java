package com.example.finalproject;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ViewMore3Activity extends AppCompatActivity
{

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more3);
        WebView webView = (WebView) findViewById(R.id.web_view3);
        webView.getSettings().setJavaScriptEnabled(true);//WebView支持JavaScript脚本
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);

        }
        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
            {
                super.onReceivedSslError(view, handler, error);
                handler.proceed(); // 接受所有网站的证书
            }
        });//这段代码的作用是，当需要从一个网页跳转到另一个网页时我们希望目标网页仍然在当前WebView中显示，而不是打开系统浏览器
        webView.loadUrl("https://baike.so.com/doc/5327886-30300944.html");
    }
}
