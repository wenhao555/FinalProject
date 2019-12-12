package com.example.finalproject;

import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ViewMore1Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more1);
        WebView webView = (WebView) findViewById(R.id.web_view1);
        webView.getSettings().setJavaScriptEnabled(true);//WebView支持JavaScript脚本
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)//不懂代码含义打开下列网站https://blog.csdn.net/sheilazxx/article/details/53259543
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
        });
        webView.loadUrl("https://baike.so.com/doc/6437593-29828321.html");//加载网页
    }
}
