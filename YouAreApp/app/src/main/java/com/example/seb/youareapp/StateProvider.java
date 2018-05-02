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
        states.add("You should be thankful. Decide what for.");
        states.add("Maybe you'll get lucky ;)");
        states.add("Try practicing frugality.");
        states.add("Today you feel like a stable genius.");
        states.add("Are you confident?");
        states.add("You are uncertain about the future.");
        states.add("Today your life does not make sense to you.");
        states.add("Remember, bad times are just times that are bad.");
        states.add("You got this Don't you?.");
        states.add("The weather will change soon.");
        states.add("Recently you've been unusually polite. Well done!");
        states.add("So it goes...");
        states.add("You are what you pretend to be, so be careful what you pretend to be.");
        states.add("There's many ways to skin that fish.");
        states.add("Make it sexy!");
        states.add("There is nothing as stable as change.");
        states.add("Sit down. Be humble.");
        states.add("You're inconsistent, even to yourself.");
        states.add("If you're not busy being born you're busy dying.");
        states.add("Be kind whenever possible. It is always possible.");
        states.add("Did you lock the door?");
        states.add("You seem worried. Maybe take up knitting?");
        states.add("You look happy. Keep going!");
        states.add("Take a nap.");
        states.add("It's not that bad.");
        states.add("You don't know what you don't know.");
        states.add("Is that a banana in your pocket?");
        states.add("You're gonna feel bad but tomorrow will be awesome!");
        states.add("Time to be quiet.");
        states.add("Look after your teeth and lungs.");
        states.add("I love the smell of HashMaps in the morning.");
        states.add("You really need to get that looked at by a professional.");



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
