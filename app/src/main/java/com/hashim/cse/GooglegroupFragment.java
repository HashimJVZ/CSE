package com.hashim.cse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GooglegroupFragment extends Fragment {

    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.googlegroup_fragment, container, false);

        webView = view.findViewById(R.id.webview_googlegroup);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://bit.ly/2Z1vJn8");

        return view;
    }
}
