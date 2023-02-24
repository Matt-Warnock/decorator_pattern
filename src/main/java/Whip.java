public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }

    public String getDescription() {
        return " Whip" + beverage.getDescription();
    }
}
