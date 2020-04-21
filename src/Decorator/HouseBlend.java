package Decorator;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="混合咖啡";
    }
    @Override
    public float cost() {
        return (float) 2.2;
    }
}