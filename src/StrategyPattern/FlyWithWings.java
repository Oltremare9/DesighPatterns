package StrategyPattern;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("给我一双翅膀飞");
    }
}
