package com.jedrivisser.privatedependencylibrary;

import androidx.annotation.Keep;

import okhttp3.OkHttpClient;

@Keep
public class EntryPoint {
    private final OkHttpClient client;

    public EntryPoint() {
        client = new OkHttpClient();
    }
}
