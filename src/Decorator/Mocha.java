package Decorator;

import Decorator.Decorator;

public class Mocha extends Decorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",摩卡";
    }

    @Override
    public float cost() {
        return 3.3f+beverage.cost();
    }
}
