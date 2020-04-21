package Observer;

public class A implements Observer,Display {
    private float a;
    private Subject o;

    public A(Subject o){
        this.o=o;
        o.register(this);

    }
    @Override
    public void display() {
        System.out.println("A的a是"+a);
    }

    @Override
    public void update(float a, float b, float c) {
        this.a=a;
        display();
    }


}
