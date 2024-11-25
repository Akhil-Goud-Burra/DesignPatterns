import Code.Subscribers.Observer;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this); // Register itself with the subject
    }

    @Override
    public void update(int value) {
        this.value = value;
        display(); // Display the updated value
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
