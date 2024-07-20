package Decorator;

public class ExtraBaconBurger extends BurgerDecorator {
    private Burger burger;

    public ExtraBaconBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ " With extra Bacon";
    }

    @Override
    public double getCost() {
        return burger.getCost()+ 30.0;
    }
}
