package com.tsi.davis.gareth.code.cats;

public class Food {

    private String type;
    private int calories;

    public Food(String type, int calories){
        this.type = type;
        this.calories = calories;
    }

    public Food(){
        this.type = "fish";
        this.calories = 100;
    }

}
