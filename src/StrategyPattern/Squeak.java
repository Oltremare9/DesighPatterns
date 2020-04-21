package StrategyPattern;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎嘎");
    }
}
