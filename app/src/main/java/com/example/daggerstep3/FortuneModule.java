package com.example.daggerstep3;

import dagger.Module;
import dagger.Provides;

// 注入されるものを提供するクラス
// ...Moduleという名前にする
@Module
public class FortuneModule {

    // 注入されるものを提供する
    // provide...という名前にする
    @Provides
    static Client provideClient(){
        return new FacebookClient();
    }
}
