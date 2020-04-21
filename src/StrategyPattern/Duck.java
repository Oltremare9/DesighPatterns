package StrategyPattern;

public abstract class Duck {
    Flyable fly;
    Quackable quack;

    public abstract void display();

    public void performFly(){
        fly.fly();

    }
    public void performQuack(){
        quack.quack();
    }
    public void setFly(Flyable fly){
        this.fly=fly;
    }
    public void setQuack(Quackable quack){
        this.quack=quack;
    }
}
