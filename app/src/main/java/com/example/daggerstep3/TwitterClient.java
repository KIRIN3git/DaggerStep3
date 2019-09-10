package com.example.daggerstep3;

import android.util.Log;

import javax.inject.Inject;

public class TwitterClient implements Client{

    // コンストラクタにも必要
    @Inject
    public TwitterClient(){
    }
    public boolean postData(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postTwitter " + fortune);

        return true;
    }

}
