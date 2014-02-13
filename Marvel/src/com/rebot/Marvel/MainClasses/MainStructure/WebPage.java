package com.rebot.Marvel.MainClasses.MainStructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.actionbarsherlock.app.SherlockFragment;
import com.rebot.Marvel.R;

/**
 * Created by brounie on 13/02/14.
 */
public class WebPage extends SherlockFragment {
    private WebView webView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.web_page, container, false);
        webView = (WebView) rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("http://brounie.com");


        return rootView;
    }

    @Override
    public void onResume() {

        super.onResume();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

}
