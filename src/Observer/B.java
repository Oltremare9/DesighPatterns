package Observer;

public class B implements Observer,Display {
    private float b;
    private Subject o;

    public B(Subject o){
        this.o=o;
        o.register(this);

    }
    @Override
    public void display() {
        System.out.println("B的a是"+b);
    }

    @Override
    public void update(float a, float b, float c) {
        this.b=b;
        display();
    }
}
