package Observer;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObervers();
}
