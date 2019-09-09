package com.example.daggerstep3;

import android.util.Log;

import javax.inject.Inject;

public class TwiterClient {


    // コンストラクタにも必要
    @Inject
    public TwiterClient(){

    }

    public boolean postTwitter(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postTwitter " + fortune);


        return true;
    }

}
