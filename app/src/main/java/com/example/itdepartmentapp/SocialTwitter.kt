package com.example.itdepartmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class SocialTwitter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_twitter)

       val twit = "https://twitter.com/uccjamaica"

        val web: WebView = findViewById(R.id.twitterView)
        web.webViewClient = CustomWebViewClient(this)
        web.loadUrl(twit)

        val webSettings = web.settings
        webSettings.javaScriptEnabled = true
    }
}