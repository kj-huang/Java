package com.monotonic;

/**
 * Created by Kevin on 2017/4/28.
 */
public class Cafe {
    private int beanInStock;
    private int mileInStock;

    public Coffee brew(CoffeeType coffeeType){ return brew(coffeeType, 1);}
    public Coffee brew(CoffeeType coffeeType, int quantity){
        requirePositive(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if(requiredBeans > beanInStock || requiredMilk > mileInStock){
            throw new IllegalStateException("Insufficient beans or milk");
        }

        beanInStock -= requiredBeans;
        mileInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }

    public void restockBeans(int weightInGrams){
        requirePositive(weightInGrams);
        beanInStock += weightInGrams;
    }


    public void restockMilk(int weightInGrams){
        requirePositive(weightInGrams);
        mileInStock += weightInGrams;
    }

    private void requirePositive(int value) {
            if (value < 1)
                throw new IllegalArgumentException();
    }

    public int getBeansInStock(){
        return beanInStock;
    }

    public int getMilkInStock(){
        return mileInStock;
    }
}
