package com.example.itdepartmentapp

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi

class SocialIG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_ig)

        val web: WebView = findViewById(R.id.igView)
        web.webViewClient = CustomWebViewClient(this)
        web.loadUrl("https://www.instagram.com/uccjamaica/")

        val webSettings = web.settings
        webSettings.javaScriptEnabled = true


    }
}

