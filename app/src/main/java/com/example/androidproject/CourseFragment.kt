package com.example.androidproject

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class CourseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_course, container, false)
        val mWebView1 = v.findViewById<View>(R.id.webview1) as WebView
        mWebView1.loadUrl("https://www.geeksforgeeks.org/ ")
        val webSettings = mWebView1.settings
        webSettings.javaScriptEnabled = true
        mWebView1.webViewClient = WebViewClient()
        mWebView1.canGoBack()
        mWebView1.setOnKeyListener(View.OnKeyListener{ v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK
                && event.action == MotionEvent.ACTION_UP
                && mWebView1.canGoBack()) {
                mWebView1.goBack()
                return@OnKeyListener true
            }
            false
        })


        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().title = "Google"
    }

}