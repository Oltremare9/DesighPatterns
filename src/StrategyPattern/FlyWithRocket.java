package StrategyPattern;

public class FlyWithRocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("坐着火箭飞");
    }
}
