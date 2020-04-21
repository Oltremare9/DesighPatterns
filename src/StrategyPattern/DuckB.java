package StrategyPattern;

public class DuckB extends Duck{
    public DuckB(){
        fly=new FlyWithWings();
        quack=new Squeak();
    }
    @Override
    public void display() {
        System.out.println("鸭子B");
    }
}
