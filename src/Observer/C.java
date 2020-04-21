package Observer;
public class C implements Observer,Display {
    private float c;
    private Subject o;

    public C(Subject o){
        this.o=o;
        o.register(this);

    }
    @Override
    public void display() {
        System.out.println("C的c是"+c);
    }

    @Override
    public void update(float a, float b, float c) {
        this.c=c;
        display();
    }
}
