package Decorator;

public class Cream extends Decorator{
    Beverage beverage;

    public Cream(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",奶油";
    }

    @Override
    public float cost() {
        return 4.4f+beverage.cost();
    }
}
