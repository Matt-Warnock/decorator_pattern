public class Marshmallows extends CondimentDecorator {
    Beverage beverage;

    public Marshmallows(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 1.05 + beverage.cost();
    }

    public String getDescription() {
        return " Yummy Marshmallows" + beverage.getDescription();
    }
}
