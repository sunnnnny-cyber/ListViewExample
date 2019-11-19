package com.example.listviewexample;

import android.widget.ImageView;

public class Player {
    //Todo finish the class player
    // Todo 5 member variables
    String name;
    int age;
    Long worth;
    String main_sport;
    int image;
    //Todo name, age, worth(money), main sport and int image resource from drawable
    //Todo create constructor and getters and setters
    public Player(String name_I, int age_I, Long worth_I, String main_sport_I, int image_I){
        name = name_I;
        age = age_I;
        worth = worth_I;
        main_sport = main_sport_I;
        image = image_I;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getWorth() {
        return worth;
    }

    public void setWorth(Long worth) {
        this.worth = worth;
    }

    public String getMain_sport() {
        return main_sport;
    }

    public void setMain_sport(String main_sport) {
        this.main_sport = main_sport;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    // use Android Studio for fast writing code, find Code->Generate
}
