package com.example.daggerstep3;

import android.util.Log;

import javax.inject.Inject;

public class FacebookClient implements Client {

    // コンストラクタにも必要
    @Inject
    public FacebookClient(){
    }

    public boolean postData(String fortune){

        // Facebookに通信処理
        Log.w("DEBUG_DATA","postFacebook " + fortune);

        return true;
    }
}