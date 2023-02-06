package bar.hse.ru.strategy;

public class Main {
    public static void main(String[] args) {
        Fisherman me = new Fisherman("calm");
        me.goingToSea();
        Fisherman you = new Fisherman("Thunder");
        you.goingToSea();
        Fisherman guy = new Fisherman("rain");
        guy.goingToSea();
    }
}