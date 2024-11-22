import Fly.FlyNoWay;

public class DuckSimulator {
    public static void main(String[] args) {
        
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        System.out.println("\nChanging behavior...");
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
}
