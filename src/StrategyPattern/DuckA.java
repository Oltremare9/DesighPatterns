package StrategyPattern;

public class DuckA extends Duck {

    public DuckA(){
        quack=new MuteQuack();
        fly=new FlyWithRocket();
    }
    @Override
    public void display() {
        System.out.println("鸭子A");
    }
}
