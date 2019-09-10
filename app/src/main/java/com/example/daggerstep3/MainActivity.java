package com.example.daggerstep3;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FortuneMachine fortuneMachine = new FortuneMachine();
        Machine fortuneMachine;
        // fortuneMachine = DaggerMainActivity_Machine.create();
        fortuneMachine = DaggerMainActivity_Machine.builder()
                .fortuneModule(new FortuneModule())
                .build();
        String result = fortuneMachine.maker().checkFortune();

        Log.w( "DEBUG_DATA", "result = " + result);
    }

    // Dagger2で依存するオブジェクトを記載
    // 使用するモジュールを記載
    @Component(modules = FortuneModule.class)
    interface Machine{
        FortuneMachine maker();
    }
}
