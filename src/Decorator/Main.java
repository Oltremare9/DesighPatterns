package Decorator;

public class Main {
    public static void main(String args[]){
        Beverage beverage=new Dark();
        System.out.println(beverage.getDescription()+" "+beverage.cost());

        beverage =new Mocha(beverage);
        beverage=new Cream(beverage);
        System.out.println(beverage.getDescription()+" "+beverage.cost());

    }
}
