public abstract class Beverage {
    String description = "UnknownBeverage";
    public String getDescription() {
        return description;
    };
    public abstract double cost();
}
