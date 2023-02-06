package bar.hse.ru.strategy;

import bar.hse.ru.strategy.strategies.Behaviour;
import bar.hse.ru.strategy.strategies.GoCrabCatching;
import bar.hse.ru.strategy.strategies.GoFishing;
import bar.hse.ru.strategy.strategies.StayHome;

public class Fisherman {

    private Behaviour fishermanBehaviour;

    public Fisherman(String weather) {
        if (weather.equalsIgnoreCase("calm")) {
            fishermanBehaviour = new GoFishing();
        } else if (weather.equalsIgnoreCase("rain")) {
            fishermanBehaviour = new GoCrabCatching();
        } else if (weather.equalsIgnoreCase("thunder")) {
            fishermanBehaviour = new StayHome();
        }
    }

    public void goingToSea() {
        fishermanBehaviour.action();
    }
}
