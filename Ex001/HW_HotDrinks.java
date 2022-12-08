package Ex001;

public class HW_HotDrinks extends Bottle {

    private Integer temp;

    public HW_HotDrinks (String name, Double cost, Double volume, Integer temp) {
        super(name,cost,volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return String.format("name = %s\ncost = %.2f руб.\nvalue = %.1f л.\ntemp = %d °С\n",super.getName(),super.getCost(),super.getVolume(), this.temp);
    }
      
}
