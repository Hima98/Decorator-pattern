package Decorator;

public class ZingerBurger extends Burger{
    @Override
    public String getDescription() {
        return "ZingerBurger";
    }

    @Override
    public double getCost() {
        return 180.0;
    }
}
