package creational_patterns.builder_design_pattern.pizza_hut.cold_drink.pepsi;

public class SmallPepsi  extends Pepsi{

    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String size() {
        return "Small Size";
    }
}