public class ObserverPatternDemo {
    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();

        SimpleObserver observer1 = new SimpleObserver(subject);
        SimpleObserver observer2 = new SimpleObserver(subject);

        subject.setValue(10); // Notify all observers about the new value
        subject.setValue(20); // Notify all observers about the updated value

        
    }
}
