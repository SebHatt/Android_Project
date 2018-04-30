package com.example.seb.youareapp;

import java.util.ArrayList;
import java.util.Collections;

public class StateProvider {

    ArrayList<String> states;

    public StateProvider(){
        setUpStates();
    }

    public void setUpStates(){
        this.states = new ArrayList();
        states.add("Today you should be thankful.");
        states.add("Today you will get lucky :)");
        states.add("Today you need to practice frugality.");
        states.add("Today you feel like a stable genius.");
        states.add("Today you think you look confident but the world is undecided.");
        states.add("Today you feel uncertain about the future.");
        states.add("Today your life does not make sense to you.");
        states.add("Today you need to focus but that may be difficult.");
        states.add("Today you are ambitious but beware!  ");
        states.add("Today you are realistic regarding the weather.");
        states.add("Today you will be unusually polite. Well done!");
        states.add("Today you are ignorant but it will pass.");

    }

    public ArrayList<String> getStates(){
        return new ArrayList<>(this.states);
    }

    public String getRandomState(){
        Collections.shuffle(this.states);
        return this.states.get(0);
    }

    public void addState(String state){
        this.states.add(state);
    }
}
