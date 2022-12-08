package Ex001;

public class Bottle extends Product {

   private Double volume;

    public Bottle(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name = %s\ncost = %.2f руб.\nvalue = %.1f л.\n",super.getName(),super.getCost(),this.volume);
    }
}
