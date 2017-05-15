package com.monotonic;

/**
 * Created by Kevin on 2017/4/28.
 */
public enum CoffeeType {
    Espresso(7,0),
    Latte(7,227),
    FiliterCoffee(10,0);

    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk){
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
