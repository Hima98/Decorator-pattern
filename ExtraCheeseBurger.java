package Decorator;

public class ExtraCheeseBurger extends BurgerDecorator{
    private Burger burger;

    public ExtraCheeseBurger(Burger burger){
        this.burger=burger;
    }


    @Override
    public String getDescription() {
        return burger.getDescription()+" With Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+ 10.0;
    }
}