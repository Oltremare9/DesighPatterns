package Decorator;

public class Dark extends Beverage {
    public Dark(){
        description="黑咖啡";
    }
    @Override
    public float cost() {
        return 1.1f;
    }
}
