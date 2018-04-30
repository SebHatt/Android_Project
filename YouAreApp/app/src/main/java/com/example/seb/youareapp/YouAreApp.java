package com.example.seb.youareapp;

public class YouAreApp {

    StateProvider stateProvider;

    public YouAreApp(StateProvider stateProvider){
        this.stateProvider = stateProvider;
    }

    public String randomState(){
        return stateProvider.getRandomState();

    }
}
