public class Cafe {
    public static void main(String[] arg) {
        Beverage order1 = new Expresso();
        order1 = new Mocha(order1);
        order1 = new Whip(order1);
        order1 = new Whip(order1);
        order1 = new Marshmallows(order1);

        System.out.println(order1.getDescription());
        System.out.println(order1.cost());

    }
}
