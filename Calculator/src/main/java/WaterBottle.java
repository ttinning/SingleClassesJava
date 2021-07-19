public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public int drinkWater() {
        return volume -= 10;
    }

    public int emptyWater() {
        return volume = 0;
    }

    public int fillWater() {
        return volume = 100;
    }


}
