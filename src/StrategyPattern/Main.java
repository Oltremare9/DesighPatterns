package StrategyPattern;

public class Main {
    public static void main(String args[]){
        Duck d=new DuckA();
        d.display();
        d.performFly();
        d.performQuack();
        d.setFly(new FlyWithWings());
        d.display();
        d.performFly();
        d.performQuack();
    }
}
