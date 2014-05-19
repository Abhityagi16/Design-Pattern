public class MiniDuckSimulator {
    public static void main(String[] args) {
	Duck mallard = new MallardDuck();
	mallard.performQuack();
	mallard.performFly();
	mallard.setFlyBehaviour(new FlyRocketPowered());
	mallard.setQuackBehaviour(new Squeak()); 
	mallard.performFly();
	mallard.performQuack();
    }
}
