package controller;

import java.util.Random;

public abstract class Animal {

    protected String type;
    protected String name;
    protected float maxJump;
    protected float maxRun;
    protected float maxSwim;
    private Random random = new Random();

    public Animal(String type, String name, float maxJump, float maxRun, float maxSwim){
        float jumpDiff = random.nextFloat() * maxJump - (maxJump / 2);
        float runDiff = random.nextFloat() * maxRun - (maxRun / 2);
        float swimDiff = random.nextFloat() * maxSwim - (maxSwim / 2);
        this.type = type;
        this.name = name;
        this.maxJump = maxJump + jumpDiff;
        this.maxRun = maxRun + runDiff;
        this.maxSwim = maxSwim + swimDiff;
    }


    public String toString(){
        return String.format("type: %s, name: %s, maxJump: %s, maxRun: %s, maxSwim: %s", type, name, maxJump, maxRun, maxSwim);
    }
}
