package com.example.daggerstep3;

import java.util.Random;

import javax.inject.Inject;

public class FortuneMachine {

    // これでNewしているのと同じ扱い
    @Inject
    Client clinet;

    String[] fortunes = {"大吉","中吉","小吉","凶","大凶"};

    // コンストラクタにも必要
    @Inject
    public FortuneMachine(){
    }

    public String checkFortune(){
        int no = getRandomNo();
        clinet.postData(fortunes[no]);
        return fortunes[no];
    }

    public int getRandomNo(){
        Random r = new Random();
        int n = r.nextInt(fortunes.length);

        return n;
    }
}
