package bar.hse.ru.strategy.strategies;

public class StayHome implements Behaviour {
    @Override
    public void action() {
        System.out.println("I`m staying at home");
    }
}
